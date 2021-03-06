package ar.kudan.eu.kudansimple;

/*
 * This class is used to store the information and constants needed for the Building Information Screen
 */
public abstract class Constants {
    public static final String EXTRA_MESSAGE_BUILDING = "com.teamazm.bugo.LIST_MESSAGE"; //the key that is used to determine the building for the info screen
    public static final String EXTRA_MESSAGE_SOURCE = "com.teamazm.bugo.SOURCE"; //the key that is used to determine the source for the info screen

    public static final int NUM_BUILDINGS = 44;


    public static final int[][] imageIDs = new int[][]{ // buildings have to be in alphabetical order in here and the
            //building list to keep the program consistent & working
            new int[]{R.drawable.building_a, R.drawable.a_first_floor, R.drawable.a_second_floor}, // A Building
            new int[]{R.drawable.building_b}, // B Building
            new int[]{R.drawable.building_cafein}, // CAFEIN
            new int[]{R.drawable.dorm_50}, // Dorm 50
            new int[]{R.drawable.dorm_51}, // Dorm 51
            new int[]{R.drawable.dorm_52}, // Dorm 52
            new int[]{R.drawable.dorm_54}, // Dorm 54
            new int[]{R.drawable.dorm_55}, // Dorm 55
            new int[]{R.drawable.dorm_60}, // Dorm 60
            new int[]{R.drawable.dorm_61}, // Dorm 61
            new int[]{R.drawable.dorm_62}, // Dorm 62
            new int[]{R.drawable.dorm_63}, // Dorm 63
            new int[]{R.drawable.dorm_64}, // Dorm 64
            new int[]{R.drawable.dorm_69}, // Dorm 69
            new int[]{R.drawable.dorm_70}, // Dorm 70
            new int[]{R.drawable.dorm_71}, // Dorm 71
            new int[]{R.drawable.dorm_72}, // Dorm 72
            new int[]{R.drawable.dorm_73}, // Dorm 73
            new int[]{R.drawable.dorm_74}, // Dorm 74
            new int[]{R.drawable.dorm_75}, // Dorm 75
            new int[]{R.drawable.dorm_76}, // Dorm 76
            new int[]{R.drawable.dorm_77}, // Dorm 77
            new int[]{R.drawable.dorm_78}, // Dorm 78
            new int[]{R.drawable.building_sports_dorm}, // Dormitory GYM //taken from: https://assets.change.org/photos/9/yi/tr/TAYITRqPcBbuWxq-800x450-noPad.jpg?1456957214
            new int[]{R.drawable.building_ea}, // EA
            new int[]{R.drawable.building_ee2}, // EE
            new int[]{R.drawable.building_fc}, // FA / FC
            new int[]{R.drawable.building_fb}, // FB
            new int[]{R.drawable.building_ff}, // FF
            new int[]{R.drawable.building_food_court}, // FOOD COURT
            new int[]{R.drawable.building_g}, // G
            new int[]{R.drawable.building_l}, // L
            new int[]{R.drawable.building_library}, // Library
            new int[]{R.drawable.building_sports_main}, // Main GYM
            new int[]{R.drawable.building_marmara}, // Marmara 
            new int[]{R.drawable.building_mayfest}, // Mayfest
            new int[]{R.drawable.building_meteksan}, // Meteksan
            new int[]{R.drawable.building_nanotam}, // Nanotam //taken from: http://www.nanotam.bilkent.edu.tr/images/n1.png
            new int[]{R.drawable.building_prayers}, // Prayer
            new int[]{R.drawable.building_sa}, // SA
            new int[]{R.drawable.building_sb}, // SB
            new int[]{R.drawable.building_student}, // Student Council
            new int[]{R.drawable.building_unam}, // UNAM
            new int[]{R.drawable.building_v}, // V taken from: http://oguzhantesisat.com/site/wp-content/uploads/2013/03/proje_1303731504.jpg

    };

    public static final String[][] infoStrings = new String[][]{ // building name , departments, num_floors, studying spots
            new String[]{"A Building", "Faculty of Social Sciences", "4", "desks on the first floor and second floor"}, // A Building
            new String[]{"B Building", "Law Faculty", "4", "free labs 301-307, \ndesks behind the stairs on the first floor, \nfree lab next to Mozart Cafe"}, // B Building
            new String[]{"CAFEIN", "-", "1", "-"}, // CAFEIN
            new String[]{"Dorm 50", "dorm", "4", "study room"}, // Dorm 50
            new String[]{"Dorm 51", "dorm", "4", "study room"}, // Dorm 51
            new String[]{"Dorm 52", "dorm", "4", "study room"}, // Dorm 52
            new String[]{"Dorm 54", "dorm", "6", "study room"}, // Dorm 54
            new String[]{"Dorm 55", "dorm", "6", "study room"}, // Dorm 55
            new String[]{"Dorm 60", "dorm", "4", "study room"}, // Dorm 60
            new String[]{"Dorm 61", "dorm", "4", "study room"}, // Dorm 61
            new String[]{"Dorm 62", "dorm", "4", "study room"}, // Dorm 62
            new String[]{"Dorm 63", "dorm", "4", "study room"}, // Dorm 63
            new String[]{"Dorm 64", "dorm", "4", "study room"}, // Dorm 64
            new String[]{"Dorm 69", "dorm", "5", "study room"}, // Dorm 69
            new String[]{"Dorm 70", "dorm", "5", "study room"}, // Dorm 70
            new String[]{"Dorm 71", "dorm", "6", "study room"}, // Dorm 71
            new String[]{"Dorm 72", "dorm", "6", "study room"}, // Dorm 72
            new String[]{"Dorm 73", "dorm", "6", "study room"}, // Dorm 73
            new String[]{"Dorm 74", "dorm", "6", "study room"}, // Dorm 74
            new String[]{"Dorm 75", "dorm", "4", "study room"}, // Dorm 75
            new String[]{"Dorm 76", "dorm", "4", "study room"}, // Dorm 76
            new String[]{"Dorm 77", "dorm", "4", "study room"}, // Dorm 77
            new String[]{"Dorm 78", "dorm", "4", "study room"}, // Dorm 78
            new String[]{"Dormitory Sports Hall", "sports center for the dorms", "3", "-"}, // Dormitory GYM
            new String[]{"EA Building", "Faculty of Engineering", "5", "desks on every floor"}, // EA
            new String[]{"EE Building", "Faculty of Electrical and Electronics Engineering", "5", "desks on the second floor"}, // EE
            new String[]{"FA/FC Building", "Faculty of Art", "4", "desks on the first floor, studios on every floor"}, // FA / FC
            new String[]{"FB Building", "Faculty of Art", "3", "studios"}, // FB
            new String[]{"FF Building", "Faculty of Architecture", "4", "studios"}, // FF
            new String[]{"Food Court", "-", "-", "-"}, // FOOD COURT
            new String[]{"G Building", "Faculty of Education", "3", "free labs, desks, reading room"}, // G
            new String[]{"L Building", "Faculty of Languages", "2", "desks"}, // L
            new String[]{"Library", "the library with two buildings connected with a bridge", "6", "individual or group desks on every floor"},    // Library
            new String[]{"Main Sports Hall", "sports center for the main campus", "2", "-"}, // Main GYM
            new String[]{"Maramara Table d'hote", "a cafeteria", "2", "-"}, // Marmara
            new String[]{"Mayfest", "a grass field festival area", "-", "-"}, // Mayfest
            new String[]{"Meteksan Market", "a grocery store for the campus", "1", "-"}, // Meteksan
            new String[]{"Nanotam", "Bilkent University Nanotechnology Research Center", "3", "-"}, // Nanotam
            new String[]{"Prayer's Room", "prayer's room of the campus", "1", "-"}, // Prayer
            new String[]{"SA Building", "Faculty of Science A block", "3", "desks on every floor"}, // SA
            new String[]{"SB Building", "Faculty of Science B block", "2", "-"}, // SB
            new String[]{"Student Council", "Student Council containing every student club", "1", "-"}, // Student Council
            new String[]{"UNAM", "National Nanotechnology Research Center", "5", "-"}, // UNAM
            new String[]{"V Building", "a building containing large lecture halls", "3", "-"}, // V
    };

}
