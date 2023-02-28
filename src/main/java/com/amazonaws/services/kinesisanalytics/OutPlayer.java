package com.amazonaws.services.kinesisanalytics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutPlayer {
    private String player_id;

    private String short_name;

    private String long_name;

    private String player_positions;

    private String overall;

    private String potential;

    private String value_eur;

    private String wage_eur;

    private String age;

    private String dateOfBirth;

    private String height_cm;

    private String weight_kg;

    private String league_id;

    private String league_name;

    private String league_level;

    private String club_team_id;

    private String club_name;

    private String club_position;

    private String club_jersey_number;

    private String club_loaned_from;

    private String club_joined_date;

    private String club_contract_valid_until_year;

    private String nationality_id;

    private String nationality_name;

    private String nation_team_id;

    private String nation_position;

    private String nation_jersey_number;

    private String preferred_foot;

    private String weak_foot;

    private String skill_moves;

    private String international_reputation;

    private String work_rate;

    private String body_type;

    private String real_face;

    private String release_clause_eur;

    public void setRelease_clause_eur(String release_clause_eur) {
        while (release_clause_eur.length() < 10) {
            release_clause_eur = release_clause_eur + "0";
        }
        this.release_clause_eur = release_clause_eur;
    }

    private String player_tags;

    private String player_traits;

    private String pace;

    private String shooting;

    private String passing;

    private String dribbling;

    private String defending;

    private String physic;

    private String attacking_crossing;

    private String attacking_finishing;

    private String attacking_heading_accuracy;

    private String attacking_short_passing;

    private String attacking_volleys;

    private String skill_dribbling;

    private String skill_curve;

    private String skill_fk_accuracy;

    private String skill_long_passing;

    private String skill_ball_control;

    private String movement_acceleration;

    private String movement_sprint_speed;

    private String movement_agility;

    private String movement_reactions;

    private String movement_balance;

    private String power_shot_power;

    private String power_jumping;

    private String power_stamina;

    private String power_strength;

    private String power_long_shots;

    private String mentality_aggression;

    private String mentality_interceptions;

    private String mentality_positioning;

    private String mentality_vision;

    private String mentality_penalties;

    private String mentality_composure;

    private String defending_marking_awareness;

    private String defending_standing_tackle;

    private String defending_sliding_tackle;

    private String goalkeeping_diving;

    private String goalkeeping_handling;

    private String goalkeeping_kicking;

    private String goalkeeping_positioning;

    private String goalkeeping_reflexes;

    private String goalkeeping_speed;

    public OutPlayer outPlayer(Player player){
        OutPlayer outPlayer = new OutPlayer();
        outPlayer.setPlayer_id(player.getPlayer_id());
        outPlayer.setShort_name(player.getShort_name());
        outPlayer.setLong_name(player.getLong_name());
        outPlayer.setPlayer_positions(player.getPlayer_positions());
        outPlayer.setOverall(player.getOverall());
        outPlayer.setPotential(player.getPotential());
        outPlayer.setValue_eur(player.getValue_eur());
        outPlayer.setWage_eur(player.getWage_eur());
        outPlayer.setAge(player.getAge());
        outPlayer.setDateOfBirth(player.getDob());
        outPlayer.setHeight_cm(player.getHeight_cm());
        outPlayer.setWeight_kg(player.getWeight_kg());
        outPlayer.setLeague_id(player.getLeague_id());
        outPlayer.setLeague_name(player.getLeague_name());
        outPlayer.setLeague_level(player.getLeague_level());
        outPlayer.setClub_team_id(player.getClub_team_id());
        outPlayer.setClub_name(player.getClub_name());
        outPlayer.setClub_position(player.getClub_position());
        outPlayer.setClub_jersey_number(player.getClub_jersey_number());
        outPlayer.setClub_loaned_from(player.getClub_loaned_from());
        outPlayer.setClub_joined_date(player.getClub_joined_date());
        outPlayer.setClub_contract_valid_until_year(player.getClub_contract_valid_until_year());
        outPlayer.setNationality_id(player.getNationality_id());
        outPlayer.setNationality_name(player.getNationality_name());
        outPlayer.setNation_team_id(player.getNation_team_id());
        outPlayer.setNation_position(player.getNation_position());
        outPlayer.setNation_jersey_number(player.getNation_jersey_number());
        outPlayer.setPreferred_foot(player.getPreferred_foot());
        outPlayer.setWeak_foot(player.getWeak_foot());
        outPlayer.setSkill_moves(player.getSkill_moves());
        outPlayer.setInternational_reputation(player.getInternational_reputation());
        outPlayer.setWork_rate(player.getWork_rate());
        outPlayer.setBody_type(player.getBody_type());
        outPlayer.setReal_face(player.getReal_face());
        outPlayer.setRelease_clause_eur(player.getRelease_clause_eur());
        outPlayer.setPlayer_tags(player.getPlayer_tags());
        outPlayer.setPlayer_traits(player.getPlayer_traits());
        outPlayer.setPace(player.getPace());
        outPlayer.setShooting(player.getShooting());
        outPlayer.setPassing(player.getPassing());
        outPlayer.setDribbling(player.getDribbling());
        outPlayer.setDefending(player.getDefending());
        outPlayer.setPhysic(player.getPhysic());
        outPlayer.setAttacking_crossing(player.getAttacking_crossing());
        outPlayer.setAttacking_finishing(player.getAttacking_finishing());
        outPlayer.setAttacking_heading_accuracy(player.getAttacking_heading_accuracy());
        outPlayer.setAttacking_short_passing(player.getAttacking_short_passing());
        outPlayer.setAttacking_volleys(player.getAttacking_volleys());
        outPlayer.setSkill_dribbling(player.getSkill_dribbling());
        outPlayer.setSkill_curve(player.getSkill_curve());
        outPlayer.setSkill_fk_accuracy(player.getSkill_fk_accuracy());
        outPlayer.setSkill_long_passing(player.getSkill_long_passing());
        outPlayer.setSkill_ball_control(player.getSkill_ball_control());
        outPlayer.setMovement_acceleration(player.getMovement_acceleration());
        outPlayer.setMovement_sprint_speed(player.getMovement_sprint_speed());
        outPlayer.setMovement_agility(player.getMovement_agility());
        outPlayer.setMovement_reactions(player.getMovement_reactions());
        outPlayer.setMovement_balance(player.getMovement_balance());
        outPlayer.setPower_shot_power(player.getPower_shot_power());
        outPlayer.setPower_jumping(player.getPower_jumping());
        outPlayer.setPower_stamina(player.getPower_stamina());
        outPlayer.setPower_strength(player.getPower_strength());
        outPlayer.setPower_long_shots(player.getPower_long_shots());
        outPlayer.setMentality_aggression(player.getMentality_aggression());
        outPlayer.setMentality_interceptions(player.getMentality_interceptions());
        outPlayer.setMentality_positioning(player.getMentality_positioning());
        outPlayer.setMentality_vision(player.getMentality_vision());
        outPlayer.setMentality_penalties(player.getMentality_penalties());
        outPlayer.setMentality_composure(player.getMentality_composure());
        outPlayer.setDefending_marking_awareness(player.getDefending_marking_awareness());
        outPlayer.setDefending_standing_tackle(player.getDefending_standing_tackle());
        outPlayer.setDefending_sliding_tackle(player.getDefending_sliding_tackle());
        outPlayer.setGoalkeeping_diving(player.getGoalkeeping_diving());
        outPlayer.setGoalkeeping_handling(player.getGoalkeeping_handling());
        outPlayer.setGoalkeeping_kicking(player.getGoalkeeping_kicking());
        outPlayer.setGoalkeeping_positioning(player.getGoalkeeping_positioning());
        outPlayer.setGoalkeeping_reflexes(player.getGoalkeeping_reflexes());
        outPlayer.setGoalkeeping_speed(player.getGoalkeeping_speed());
        return outPlayer;
    }

    public OutPlayer(Player player){
        player_id = player.getPlayer_id();
        short_name = player.getShort_name();
        long_name = player.getLong_name();
        player_positions = player.getPlayer_positions();
        overall = player.getOverall();
        potential = player.getPotential();
        value_eur = player.getValue_eur();
        wage_eur = player.getWage_eur();
        age = player.getAge();
        dateOfBirth = player.getDob();
        height_cm = player.getHeight_cm();
        weight_kg = player.getWeight_kg();
        league_id = player.getLeague_id();
        league_name = player.getLeague_name();
        league_level = player.getLeague_level();
        club_team_id = player.getClub_team_id();
        club_name = player.getClub_name();
        club_position = player.getClub_position();
        club_jersey_number = player.getClub_jersey_number();
        club_loaned_from = player.getClub_loaned_from();
        club_joined_date = player.getClub_joined_date();
        club_contract_valid_until_year = player.getClub_contract_valid_until_year();
        nationality_id = player.getNationality_id();
        nationality_name = player.getNationality_name();
        nation_team_id = player.getNation_team_id();
        nation_position = player.getNation_position();
        nation_jersey_number = player.getNation_jersey_number();
        preferred_foot = player.getPreferred_foot();
        weak_foot = player.getWeak_foot();
        skill_moves = player.getSkill_moves();
        international_reputation = player.getInternational_reputation();
        work_rate = player.getWork_rate();
        body_type = player.getBody_type();
        real_face = player.getReal_face();
        release_clause_eur = player.getRelease_clause_eur();
        player_tags = player.getPlayer_tags();
        player_traits = player.getPlayer_traits();
        pace = player.getPace();
        shooting = player.getShooting();
        passing = player.getPassing();
        dribbling = player.getDribbling();
        defending = player.getDefending();
        physic = player.getPhysic();
        attacking_crossing = player.getAttacking_crossing();
        attacking_finishing = player.getAttacking_finishing();
        attacking_heading_accuracy = player.getAttacking_heading_accuracy();
        attacking_short_passing = player.getAttacking_short_passing();
        attacking_volleys = player.getAttacking_volleys();
        skill_dribbling = player.getSkill_dribbling();
        skill_curve = player.getSkill_curve();
        skill_fk_accuracy = player.getSkill_fk_accuracy();
        skill_long_passing = player.getSkill_long_passing();
        skill_ball_control = player.getSkill_ball_control();
        movement_acceleration = player.getMovement_acceleration();
        movement_sprint_speed = player.getMovement_sprint_speed();
        movement_agility = player.getMovement_agility();
        movement_reactions = player.getMovement_reactions();
        movement_balance = player.getMovement_balance();
        power_shot_power = player.getPower_shot_power();
        power_jumping = player.getPower_jumping();
        power_stamina = player.getPower_stamina();
        power_strength = player.getPower_strength();
        power_long_shots = player.getPower_long_shots();
        mentality_aggression = player.getMentality_aggression();
        mentality_interceptions = player.getMentality_interceptions();
        mentality_positioning = player.getMentality_positioning();
        mentality_vision = player.getMentality_vision();
        mentality_penalties = player.getMentality_penalties();
        mentality_composure = player.getMentality_composure();
        defending_marking_awareness = player.getDefending_marking_awareness();
        defending_standing_tackle = player.getDefending_standing_tackle();
        defending_sliding_tackle = player.getDefending_sliding_tackle();
        goalkeeping_diving = player.getGoalkeeping_diving();
        goalkeeping_handling = player.getGoalkeeping_handling();
        goalkeeping_kicking = player.getGoalkeeping_kicking();
        goalkeeping_positioning = player.getGoalkeeping_positioning();
        goalkeeping_reflexes = player.getGoalkeeping_reflexes();
        goalkeeping_speed = player.getGoalkeeping_speed();
    }

}
