package com.amazonaws.services.kinesisanalytics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutPlayer2 {
    private String player_id;

    private String short_name;

    private String long_name;

    private String player_positions;

    private String overall;

    private String potential;

    private String value_eur;

    private String wage_eur;

    private String age;

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

    public OutPlayer2(InPlayer inPlayer){
        player_id = inPlayer.getPlayer_id();
        short_name = inPlayer.getShort_name();
        long_name = inPlayer.getLong_name();
        player_positions = inPlayer.getPlayer_positions();
        overall = inPlayer.getOverall();
        potential = inPlayer.getPotential();
        value_eur = inPlayer.getValue_eur();
        wage_eur = inPlayer.getWage_eur();
        age = inPlayer.getAge();
        height_cm = inPlayer.getHeight_cm();
        weight_kg = inPlayer.getWeight_kg();
        league_id = inPlayer.getLeague_id();
        league_name = inPlayer.getLeague_name();
        league_level = inPlayer.getLeague_level();
        club_team_id = inPlayer.getClub_team_id();
        club_name = inPlayer.getClub_name();
        club_position = inPlayer.getClub_position();
        club_jersey_number = inPlayer.getClub_jersey_number();
        club_loaned_from = inPlayer.getClub_loaned_from();
        club_joined_date = inPlayer.getClub_joined_date();
        club_contract_valid_until_year = inPlayer.getClub_contract_valid_until_year();
        nationality_id = inPlayer.getNationality_id();
        nationality_name = inPlayer.getNationality_name();
        nation_team_id = inPlayer.getNation_team_id();
        nation_position = inPlayer.getNation_position();
        nation_jersey_number = inPlayer.getNation_jersey_number();
        preferred_foot = inPlayer.getPreferred_foot();
        weak_foot = inPlayer.getWeak_foot();
        skill_moves = inPlayer.getSkill_moves();
        international_reputation = inPlayer.getInternational_reputation();
        work_rate = inPlayer.getWork_rate();
        body_type = inPlayer.getBody_type();
        real_face = inPlayer.getReal_face();
        release_clause_eur = inPlayer.getRelease_clause_eur();
        while(release_clause_eur.length() < 10) {
            release_clause_eur = inPlayer.getRelease_clause_eur() + "0";
        }
        player_tags = inPlayer.getPlayer_tags();
        player_traits = inPlayer.getPlayer_traits();
        pace = inPlayer.getPace();
        shooting = inPlayer.getShooting();
        passing = inPlayer.getPassing();
        dribbling = inPlayer.getDribbling();
        defending = inPlayer.getDefending();
        physic = inPlayer.getPhysic();
        attacking_crossing = inPlayer.getAttacking_crossing();
        attacking_finishing = inPlayer.getAttacking_finishing();
        attacking_heading_accuracy = inPlayer.getAttacking_heading_accuracy();
        attacking_short_passing = inPlayer.getAttacking_short_passing();
        attacking_volleys = inPlayer.getAttacking_volleys();
        skill_dribbling = inPlayer.getSkill_dribbling();
        skill_curve = inPlayer.getSkill_curve();
        skill_fk_accuracy = inPlayer.getSkill_fk_accuracy();
        skill_long_passing = inPlayer.getSkill_long_passing();
        skill_ball_control = inPlayer.getSkill_ball_control();
        movement_acceleration = inPlayer.getMovement_acceleration();
        movement_sprint_speed = inPlayer.getMovement_sprint_speed();
        movement_agility = inPlayer.getMovement_agility();
        movement_reactions = inPlayer.getMovement_reactions();
        movement_balance = inPlayer.getMovement_balance();
        power_shot_power = inPlayer.getPower_shot_power();
        power_jumping = inPlayer.getPower_jumping();
        power_stamina = inPlayer.getPower_stamina();
        power_strength = inPlayer.getPower_strength();
        power_long_shots = inPlayer.getPower_long_shots();
        mentality_aggression = inPlayer.getMentality_aggression();
        mentality_interceptions = inPlayer.getMentality_interceptions();
        mentality_positioning = inPlayer.getMentality_positioning();
        mentality_vision = inPlayer.getMentality_vision();
        mentality_penalties = inPlayer.getMentality_penalties();
        mentality_composure = inPlayer.getMentality_composure();
        defending_marking_awareness = inPlayer.getDefending_marking_awareness();
        defending_standing_tackle = inPlayer.getDefending_standing_tackle();
        defending_sliding_tackle = inPlayer.getDefending_sliding_tackle();
        goalkeeping_diving = inPlayer.getGoalkeeping_diving();
        goalkeeping_handling = inPlayer.getGoalkeeping_handling();
        goalkeeping_kicking = inPlayer.getGoalkeeping_kicking();
        goalkeeping_positioning = inPlayer.getGoalkeeping_positioning();
        goalkeeping_reflexes = inPlayer.getGoalkeeping_reflexes();
        goalkeeping_speed = inPlayer.getGoalkeeping_speed();
    }

}
