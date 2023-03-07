package reference;

import com.amazonaws.services.kinesisanalytics.InPlayer;
import com.amazonaws.services.kinesisanalytics.OutPlayer;
import com.amazonaws.services.kinesisanalytics.OutPlayer2;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.core.fs.FileSystem;

public class LocalMultipleJobs {

    public static void main(String[] args) throws Exception {

        Configuration configuration = new Configuration();

        //Job-1
        ExecutionEnvironment executionEnvironment = ExecutionEnvironment.createLocalEnvironmentWithWebUI(configuration);

        DataSource<InPlayer> dataSource1 = executionEnvironment.readCsvFile("/Users/ravaliyendluri/Desktop/Johny/kda-flink/S3Sink/src/main/resources/input/")
                .pojoType(InPlayer.class,
                        "player_id","player_url","fifa_version","fifa_update","fifa_update_date",
                        "short_name","long_name","player_positions","overall","potential","value_eur",
                        "wage_eur","age","dob","height_cm","weight_kg","league_id","league_name",
                        "league_level","club_team_id","club_name","club_position","club_jersey_number",
                        "club_loaned_from","club_joined_date","club_contract_valid_until_year","nationality_id",
                        "nationality_name","nation_team_id","nation_position","nation_jersey_number",
                        "preferred_foot","weak_foot","skill_moves","international_reputation","work_rate",
                        "body_type","real_face","release_clause_eur","player_tags","player_traits","pace",
                        "shooting","passing","dribbling","defending","physic","attacking_crossing",
                        "attacking_finishing","attacking_heading_accuracy","attacking_short_passing",
                        "attacking_volleys","skill_dribbling","skill_curve","skill_fk_accuracy",
                        "skill_long_passing","skill_ball_control","movement_acceleration",
                        "movement_sprint_speed","movement_agility","movement_reactions",
                        "movement_balance","power_shot_power","power_jumping","power_stamina",
                        "power_strength","power_long_shots","mentality_aggression","mentality_interceptions",
                        "mentality_positioning","mentality_vision","mentality_penalties","mentality_composure",
                        "defending_marking_awareness","defending_standing_tackle","defending_sliding_tackle",
                        "goalkeeping_diving","goalkeeping_handling","goalkeeping_kicking","goalkeeping_positioning",
                        "goalkeeping_reflexes","goalkeeping_speed","ls","st","rs","lw","lf","cf","rf","rw","lam",
                        "cam","ram","lm","lcm","cm","rcm","rm","lwb","ldm","cdm","rdm","rwb","lb","lcb","cb","rcb",
                        "rb","gk","player_face_url");
        //Sink1
        dataSource1.map(player -> {return new OutPlayer(player);})
                .writeAsText("/Users/ravaliyendluri/Desktop/Johny/kda-flink/S3Sink/src/main/resources/output/", FileSystem.WriteMode.OVERWRITE);

        DataSource<InPlayer> dataSource2 = executionEnvironment.readCsvFile("/Users/ravaliyendluri/Desktop/Johny/kda-flink/S3Sink/src/main/resources/input2/")
                .pojoType(InPlayer.class,
                        "player_id","player_url","fifa_version","fifa_update","fifa_update_date",
                        "short_name","long_name","player_positions","overall","potential","value_eur",
                        "wage_eur","age","dob","height_cm","weight_kg","league_id","league_name",
                        "league_level","club_team_id","club_name","club_position","club_jersey_number",
                        "club_loaned_from","club_joined_date","club_contract_valid_until_year","nationality_id",
                        "nationality_name","nation_team_id","nation_position","nation_jersey_number",
                        "preferred_foot","weak_foot","skill_moves","international_reputation","work_rate",
                        "body_type","real_face","release_clause_eur","player_tags","player_traits","pace",
                        "shooting","passing","dribbling","defending","physic","attacking_crossing",
                        "attacking_finishing","attacking_heading_accuracy","attacking_short_passing",
                        "attacking_volleys","skill_dribbling","skill_curve","skill_fk_accuracy",
                        "skill_long_passing","skill_ball_control","movement_acceleration",
                        "movement_sprint_speed","movement_agility","movement_reactions",
                        "movement_balance","power_shot_power","power_jumping","power_stamina",
                        "power_strength","power_long_shots","mentality_aggression","mentality_interceptions",
                        "mentality_positioning","mentality_vision","mentality_penalties","mentality_composure",
                        "defending_marking_awareness","defending_standing_tackle","defending_sliding_tackle",
                        "goalkeeping_diving","goalkeeping_handling","goalkeeping_kicking","goalkeeping_positioning",
                        "goalkeeping_reflexes","goalkeeping_speed","ls","st","rs","lw","lf","cf","rf","rw","lam",
                        "cam","ram","lm","lcm","cm","rcm","rm","lwb","ldm","cdm","rdm","rwb","lb","lcb","cb","rcb",
                        "rb","gk","player_face_url");

        //Sink2
        dataSource2.map(player -> {return new OutPlayer2(player);})
                .writeAsText("/Users/ravaliyendluri/Desktop/Johny/kda-flink/S3Sink/src/main/resources/output2/", FileSystem.WriteMode.OVERWRITE);

        executionEnvironment.executeAsync("LocalMultipleJob");

        Thread.sleep(1000000);

    }

}
