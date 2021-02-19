package com.example.quiz3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.quiz3.TriviaQuizContract.*;


import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TriviaQuizHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="TriviaQuiz.db";
    public static final int DATABASE_VERSION = 3;
    private  SQLiteDatabase db;

    public TriviaQuizHelper(Context context) {
        super( context,  DATABASE_NAME, null, DATABASE_VERSION );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " TEXT " +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);

        fillQuestionsTable();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void addQuestions(TriviaQuestions question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR,question.getAnswerNr());
        db.insert(QuestionTable.TABLE_NAME,null,cv);
    }

    private void fillQuestionsTable(){

        TriviaQuestions q1 = new TriviaQuestions( "Which of the following is not a computer language?",
                "BASIC", "FORTRAN","LOUTS","COBOL",
                "LOUTS");
        addQuestions(q1);

        TriviaQuestions q2 = new TriviaQuestions( "The Environment Ministry recently released a National" +
                " action plan for conservation of which species?",
                "Marine Turtle", "Great Indian Bustard","Brahmaputra Dolphin","Black Buck",
                "Marine Turtle");
        addQuestions(q2);

        TriviaQuestions q3 = new TriviaQuestions( "India launched the ‘Year of Environment’ with which " +
                "friendly country?",
                "Nepal", "France","Brazil","Japan",
                "France");
        addQuestions(q3);

        TriviaQuestions q4 = new TriviaQuestions( "Which Indian monument was lit on January 30, to" +
                " observe the Neglected Tropical Diseases (NTD) Day?",
                "India Gate", "Qutub Minar","Taj Mahal","Golden Temple",
                "Qutub Minar");
        addQuestions(q4);

        TriviaQuestions q5 = new TriviaQuestions( "‘Amrut Mahotsav’, which was seen in the news recently, " +
                "is the celebration of which event?",
                "125th birth anniversary of Netaji", "75th year of India’s Independence"
                ,"50th year of 1971 War"
                ,"50th year of Kargil War",
                "75th year of India’s Independence");
        addQuestions(q5);

        TriviaQuestions q6 = new TriviaQuestions( "What is the corpus of the Start-up India Seed" +
                " Fund Scheme (SISFS), which was approved recently?",
                "Rs 95 crore", "Rs 250 crore","Rs 500 crore","Rs 945 crore",
                "Rs 945 crore");
        addQuestions(q6);

        TriviaQuestions q7 = new TriviaQuestions( "The Tableau of which state was adjudged" +
                " best at the Republic Day parade?",
                "Assam", "Tripura","Uttar Pradesh","Gujarat",
                "Uttar Pradesh");
        addQuestions(q7);

        TriviaQuestions q8 = new TriviaQuestions( "External Affairs Minister S Jai Shankar " +
                "proposed Eight Guiding principles to repair the strained relations with which country?",
                "China", "Pakistan","Afghanistan","United States",
                "China");
        addQuestions(q8);

        TriviaQuestions q9 = new TriviaQuestions( "As per the NSO’s revised estimates released recently," +
                " what was India’s GDP growth rate for 2019-20?",
                " 1.3%", "3.2%","4.0%","5.2%",
                "4.0%");
        addQuestions(q9);
        TriviaQuestions q10 = new TriviaQuestions( "Who has been appointed as the new Chief" +
                " Executive of the National Health Authority (NHA)?",
                "N S Viswanathan", "R S Sharma","Tarun Gogoi","B P Kanungo",
                "R S Sharma");
        addQuestions(q10);

        TriviaQuestions q11 = new TriviaQuestions( "As per a recent research, by what percentage" +
                " the number of oceanic sharks and rays have declined in Indian Ocean?",
                "15.3%", "26.4%","39.7%","84.7%",
                "84.7%");
        addQuestions(q11);

        TriviaQuestions q12 = new TriviaQuestions( "As per the recent monetary policy committee " +
                "statement of the RBI, what is the expected GDP growth rate in FY22?",
                "6.5 per cent", " 8.5 per cent","10.5 per cent","12.5 per cent",
                "10.5 per cent");
        addQuestions(q12);
        TriviaQuestions q13 = new TriviaQuestions( "Which tournament would be conducted this year " +
                "by the BCCI in place of Ranji Trophy?",
                "Anna Hazare Trophy", " Sachin Trophy","Vijay Hazare Trophy","Seema Roy Trophy",
                "Vijay Hazare Trophy");
        addQuestions(q13);

        TriviaQuestions q14 = new TriviaQuestions( "As per a recent research, by what percentage " +
                "the number of oceanic sharks and rays have declined in Indian Ocean?",
                "15.3%", "26.4%","39.7%","84.7%",
                "84.7%");
        addQuestions(q14);

        TriviaQuestions q15 = new TriviaQuestions( "The cabinet of which state has recently cleared " +
                "new Industrial Policy and proposals over Rs 52000 crores?",
                "Kerala", "Tamil Nadu","Maharashtra","Assam",
                "Tamil Nadu");
        addQuestions(q15);

        TriviaQuestions q16 = new TriviaQuestions( "Which organization has released the framework" +
                " for strengthening the grievance redress mechanism in banks?",
                "SEBI", "RBI","Ministry of Finance","IBBI",
                "RBI");
        addQuestions(q16);

        TriviaQuestions q17 = new TriviaQuestions("Which country is resettling its refugees" +
                " in the Bhashan Char Island?"
                ,"China","Bangladesh","Nepal","Sri Lanka" ,"Bangladesh");
        addQuestions(q17);
        TriviaQuestions q18 = new TriviaQuestions( "What is the rank of India in the production" +
                " of silk, globally?",
                "First", "Second","Third","Fourth",
                "Second");
        addQuestions(q18);

        TriviaQuestions q19 = new TriviaQuestions( "‘Neptune Declaration’, which was seen in the news recently, " +
                "is associated with which sector?",
                "Aviation", "Migrant Labourers","Maritime","Sports",
                "Maritime");
        addQuestions(q19);

        TriviaQuestions q20 = new TriviaQuestions( "Which Indian company has partnered with" +
                " UNICEF to distribute vaccines around the world?",
                "Biocon", "Serum Institute of India","Bharat Biotech","Dr Reddys",
                "Serum Institute of India");
        addQuestions(q20);

        TriviaQuestions q21 = new TriviaQuestions( "Who is the chairperson of 15th Finance Commission?",
                "Raghuram Rajan", "NK Singh","D Subbarao","YV Reddy",
                "NK Singh");
        addQuestions(q21);

        TriviaQuestions q22 = new TriviaQuestions( "As per Union Budget 2021-22, what is the new " +
                "threshold for paid up capital applicable to ‘small companies’?",
                "Rs.10 lakh", "Rs.1 crore","Rs.20 lakh","Rs.2 crore",
                "Rs.2 crore");
        addQuestions(q22);

        TriviaQuestions q23 = new TriviaQuestions( "What is the new FDI limit in insurance companies," +
                " as proposed in Union Budget 2021-22?",
                "26%", " 51%"," 74%"," 100%",
                "74%");
        addQuestions(q23);

        TriviaQuestions q24 = new TriviaQuestions( "Praveen Sinha has been appointed as the Acting" +
                " Chief of which Indian organisation?",
                " Intelligence Bureau", "Central Vigilance Commission","Central Bureau of Investigation",
                "Election Commission of India",
                "Central Bureau of Investigation");
        addQuestions(q24);


        TriviaQuestions q25 = new TriviaQuestions( "Which company has tied up with the Russian" +
                " aircraft corporation MiG to provide post-warranty support to the Indian Navy jets?",
                "Crown group", "Adani Defence","Pushpak","Garuda",
                "Crown group");
        addQuestions(q25);


        TriviaQuestions q26 = new TriviaQuestions( "What is the classification of Fishing Cat," +
                " as per IUCN Red list?",
                "Least Concern", "Critically Endangered","Vulnerable","Extinct",
                "Vulnerable");
        addQuestions(q26);


        TriviaQuestions q27 = new TriviaQuestions( "What is the name of the app developed by " +
                "Ministry of Home Affairs, to seek help during emergencies?",
                "Locate Nearest Police Station", "Emergency","UR Help","My Friend",
                "Locate Nearest Police Station");
        addQuestions(q27);

        TriviaQuestions q28 = new TriviaQuestions( "Which word is selected as the Oxford Hindi word " +
                "of 2020?",
                " Aadhar", "Samvidhan","Aatmanirbharta","Mahaa maaree",
                "Aatmanirbharta");
        addQuestions(q28);

        TriviaQuestions q29 = new TriviaQuestions( "The Supreme Court has directed which Mutual Fund " +
                "company to distribute Rs 9122 crores to its unitholders?",
                " Baroda Mutual Fund", "BNP Paribas Mutual Fund","Franklin Templeton Mutual Fund",
                " Aditya Birla Sun Life Mutual Fund",
                "Franklin Templeton Mutual Fund");
        addQuestions(q29);

        TriviaQuestions q30 = new TriviaQuestions( "Which organisation proposed a plan to develop" +
                " ‘Little Andaman Island’ as a tourism hotspot?",
                "Tourism Ministry", "NITI Aayog","NHAI"," IRCTC",
                "NITI Aayog");
        addQuestions(q30);

        TriviaQuestions q31 = new TriviaQuestions( "Which Indian state has launched a scheme to provide" +
                " financial assistance to start-ups for filing IT patents?",
                "Kerala", "Tamil Nadu","Maharashtra","Karnataka",
                "Maharashtra");
        addQuestions(q31);


        TriviaQuestions q32 = new TriviaQuestions( "Amazon has been in a legal dispute against which " +
                "company for selling its retail assets to Reliance Retail?",
                " D-Mart", "Future Retail","Aditya Birla Retail","K Raheja Corp",
                "Future Retail");
        addQuestions(q32);

        TriviaQuestions q33 = new TriviaQuestions( "In which state, the Kaliveli Lake is located?",
                " Kerala", "Maharashtra","Goa","Tamil Nadu",
                "Tamil Nadu");
        addQuestions(q33);

        TriviaQuestions q34 = new TriviaQuestions( "What is the new height recorded in India’s" +
                " Foreign portfolio " +
                "investment (FPI) , as of 2020?",
                " USD 10.6 billion", "USD 15.1 billion","USD 23.4 billion","USD 31.7 billion",
                "USD 31.7 billion");
        addQuestions(q34);

        TriviaQuestions q35 = new TriviaQuestions( "What is India’s rank in the 2020 Democracy " +
                "Index?",
                "53", "57","61","67",
                "53");
        addQuestions(q35);


        TriviaQuestions q36 = new TriviaQuestions( "India is set to celebrate the centenary birth" +
                " year of which legendary vocalist?",
                "Pandit Jasraj", "Pandit Bhimsen Joshi","Mohammad Rafi","Kishore Kumar",
                "Pandit Bhimsen Joshi");
        addQuestions(q36);

        TriviaQuestions q37 = new TriviaQuestions( "As of February 2020, how many green zone sites have " +
                "been approved for operating drones?",
                "12", "32","52","72",
                "32");
        addQuestions(q37);

        TriviaQuestions q38 = new TriviaQuestions( "The Reserve Bank of India (RBI) is to set up an expert" +
                " committee on which category of banks?",
                "Small Finance Banks", "Urban Cooperative Banks","Regional Rural Banks","Neo Banks",
                "Urban Cooperative Banks");
        addQuestions(q38);

        TriviaQuestions q39 = new TriviaQuestions( "Which global digital payment company has announced to shut " +
                "down its payment operations in India?",
                "Pay Pal", "Capital One","American Express","Aeropay",
                "Pay Pal");
        addQuestions(q39);

        TriviaQuestions q40 = new TriviaQuestions( "Rashtriya Ispat Nigam Ltd (RINL), is located in which Indian " +
                "state/UT?",
                "Bihar", "Jharkhand","Andhra Pradesh","Maharashtra",
                "Andhra Pradesh");
        addQuestions(q40);

        TriviaQuestions q41 = new TriviaQuestions( "Which Union Ministry is promoting the Floating Structure infrastructure " +
                "in India?",
                "Ministry of Commerce and Industry", "Ministry of Jal Shakti","Ministry of Ports, Shipping and Waterways"
                ,"Ministry of MSME",
                "Ministry of Ports, Shipping and Waterways");
        addQuestions(q41);

        TriviaQuestions q42 = new TriviaQuestions( "As per CERT-In, what is the number of cyber security incidents related to " +
                "digital banking, were reported in 2020?",
                "29,000", "2.9 Lakh","67000","6.7 lakh",
                "2.9 Lakh");
        addQuestions(q42);

        TriviaQuestions q43 = new TriviaQuestions( "Antonio Guterres is the Secretary General of which global organisation?",
                "IMF", "UN","World Bank","WEF",
                "UN");
        addQuestions(q43);

        TriviaQuestions q44 = new TriviaQuestions( "Who is the first cricket player to score a double century in the 100th " +
                "test match?",
                "Virat Kohli", "Ajinkya Rahane","Joe Root","Pat Cummins",
                "Joe Root");
        addQuestions(q44);

        TriviaQuestions q45 = new TriviaQuestions( "“Al-Amal”, which was making news recently, is the unmanned space probe of" +
                " the country?",
                "Israel", "UAE","Qatar","Oman",
                "UAE");
        addQuestions(q45);

        TriviaQuestions q46 = new TriviaQuestions( "Tapovan hydel project, which was making news recently, is located in which" +
                " Indian state/UT?",
                "Odisha", "West Bengal","Uttarakhand","Bihar",
                "Uttarakhand");
        addQuestions(q46);

        TriviaQuestions q47 = new TriviaQuestions( "An investment of Rs.400 crore is to be made in which Union state/UT, to make" +
                " it a fisheries hub?",
                "Tamil Nadu", "Goa","Kerala","Odisha",
                "Goa");
        addQuestions(q47);

        TriviaQuestions q48 = new TriviaQuestions( "Education Ministry is to rename Samagra Shiksha Scheme-funded residential " +
                "schools and hostels after whose name?",
                "Mahatma Gandhi", "Netaji Subash Chandra Bose","Sardar Vallabhbhai Patel","B R Ambedkar",
                "Netaji Subash Chandra Bose");
        addQuestions(q48);

        TriviaQuestions q49 = new TriviaQuestions( "‘Business Confidence Index’, which was making news recently, is released " +
                "by which institution?",
                "RBI", "NABARD","NCAER","SEBI",
                "NCAER");
        addQuestions(q49);

        TriviaQuestions q50 = new TriviaQuestions( "“Al-Amal”, which was making news recently, is the unmanned space probe of " +
                "the country?",
                "Israel", "UAE","Qatar","Oman","UAE" );
        addQuestions(q50);

        TriviaQuestions q51 = new TriviaQuestions( "What amount of funds have been allotted by the Union Government for PMFBY " +
                "for FY 2021-22?",
                "Rs.1000 crore", "Rs.5000 crore","Rs.10,000 crore","Rs.16,000 crore",
                "Rs.16,000 crore");
        addQuestions(q51);

        TriviaQuestions q52 = new TriviaQuestions( "\"In which year did the United States come out of the UN Human Rights Council?",
                "2014", "2016","2018","2020",
                "2018");
        addQuestions(q52);

        TriviaQuestions q53 = new TriviaQuestions( "Which top populous country recorded over 15% dip in registered births year" +
                " on year?",
                "India", "China","Indonesia","Pakistan",
                "China");
        addQuestions(q53);

        TriviaQuestions q54 = new TriviaQuestions( "Which body has set up a sub-group for preparing the " +
                "‘National Action Plan for Migrant Workers’?",
                "Labour Bureau", "NITI Aayog","RBI","NABARD",
                "NITI Aayog");
        addQuestions(q54);

        TriviaQuestions q55 = new TriviaQuestions( "Which Indian airport has bagged the World’s ‘Voice of the Customer’ award from" +
                " the Airports Council International?",
                "Cochin International Airport", "Delhi International Airport","Bangalore International Airport"
                ,"Chennai International Airport",
                "Bangalore International Airport");
        addQuestions(q55);

        TriviaQuestions q56 = new TriviaQuestions( "Screenwriter and Academy award winner, Jean-Claude Carriere," +
                " who passed away recently, was from which country?",
                "Russia", "Italy","France","Scotland",
                "France");
        addQuestions(q56);

        TriviaQuestions q57 = new TriviaQuestions( "Which country has recently launched a 10-year space program?",
                "Israel", "China","USA","Turkey",
                "Turkey");
        addQuestions(q57);

        TriviaQuestions q58 = new TriviaQuestions( "Which country’s new rules on drones, permit them to fly over" +
                " people and at night in the country?",
                "China", "Russia","United States","South Korea",
                "United States");
        addQuestions(q58);

        TriviaQuestions q59 = new TriviaQuestions( "The Union Cabinet approved MoU between India and which country, " +
                "on peaceful uses of outer space?",
                "Sri Lanka", "Bhutan","Vietnam","Thailand",
                "Bhutan");
        addQuestions(q59);

        TriviaQuestions q60 = new TriviaQuestions( "Which type of Ethanol is made from sources like molasses, sugarcane," +
                " sugar beet, sorghum and edible oil seeds?",
                "1G ethanol", "2G ethanol","3G ethanol","Clean Ethanol",
                "1G ethanol");
        addQuestions(q60);

        TriviaQuestions q61 = new TriviaQuestions( "What is ‘SAHAYAK-NG’, which was seen in the news recently?",
                "Surface to Surface Missile", "Fighter jet","Air droppable container","Unmanned Aerial Vehicle",
                "Air droppable container");
        addQuestions(q61);

        TriviaQuestions q62 = new TriviaQuestions( "Which state has been declared a “Disturbed area” for six " +
                "more months, by the Home Ministry?",
                "Assam", "Nagaland","Mizoram","Manipur",
                "Nagaland");
        addQuestions(q62);

        TriviaQuestions q63 = new TriviaQuestions( "The Ministry of Electronics and IT is set to impact assessment" +
                " of which mobile application?",
                " My FASTag", "UMANG","DigiLocker","Arogya Setu",
                "UMANG");
        addQuestions(q63);

        TriviaQuestions q64 = new TriviaQuestions( "Where is the headquarters of the International Organization " +
                "of Securities Commissions (IOSCO) located?",
                "Geneva", "Madrid","Rome","Lausanne",
                "Madrid");
        addQuestions(q64);

        TriviaQuestions q65 = new TriviaQuestions( "Sambalpur, where the Prime Minister of India, laid the foundation" +
                " stone of IIM, is located in which state?",
                "West Bengal", "Odisha","Bihar","Uttarakhand",
                "Odisha");
        addQuestions(q65);

        TriviaQuestions q66 = new TriviaQuestions( "Pong Dam sanctuary, which was seen in the news recently, is located " +
                "in which state?",
                "Himachal Pradesh", " Madhya Pradesh","Sikkim","Gujarat",
                "Himachal Pradesh");
        addQuestions(q66);

        TriviaQuestions q67 = new TriviaQuestions( "Which research body has organized the National Metrology Conclave " +
                "2021?",
                "ISRO", "DRDO","CSIR","IIT Bombay",
                "CSIR");
        addQuestions(q67);

        TriviaQuestions q68 = new TriviaQuestions( "The Oxford University has developed a survey of which animals using" +
                " satellite imagery and artificial intelligence (AI)?",
                "African Elephants", "Pandas","Sloths","Mountain Gorillas",
                "African Elephants");
        addQuestions(q68);

        TriviaQuestions q69 = new TriviaQuestions( "As per the NSO’s first advanced estimates, what would be the GDP" +
                " growth/contraction in India, in FY 2020-21?",
                " + 3.2%", "+ 1.2%","– 6.4%","– 7.7%",
                "– 7.7%");
        addQuestions(q69);

        TriviaQuestions q70 = new TriviaQuestions( "Which civic body of India has launched the ‘Period room’ initiative," +
                " for improving menstrual hygiene of women?",
                "Thiruvananthapuram Municipal Corporation", "Thane Municipal Corporation",
                "Visakhapatnam Municipal Corporation","Bengaluru Municipal Corporation",
                "Thane Municipal Corporation");
        addQuestions(q70);

        TriviaQuestions q71 = new TriviaQuestions( "Which organisation announced to provide offer a free Domain Name in" +
                " any of the 22 official Indian language?",
                "ICANN", "NIXI","DSCI","APNIC",
                "NIXI");
        addQuestions(q71);

        TriviaQuestions q72 = new TriviaQuestions( "Which Indian bank has collaborated with IIT Kanpur to set up a " +
                "Fintech Innovation Centre (FIC)?",
                "State Bank of India", "Punjab National Bank","Bank of Baroda","Canara Bank",
                "Punjab National Bank");
        addQuestions(q72);

        TriviaQuestions q73 = new TriviaQuestions( "Subodh Kumar Jaiswal has taken charge as the new Director General " +
                "of which armed force?",
                "CAPF", "ITPF","CISF","RPF",
                "CISF");
        addQuestions(q73);

        TriviaQuestions q74 = new TriviaQuestions( "India reviewed its bilateral cooperation with which country, in the " +
                "field of hydrocarbons and steel sector?",
                "Japan", "Mongolia","Belgium","Finland",
                "Mongolia");
        addQuestions(q74);

        TriviaQuestions q75 = new TriviaQuestions( "Which country’s passport is declared the most powerful, as per the " +
                "Henley Passport Index?",
                "Singapore", "Japan","United States","United Kingdom",
                "Japan");
        addQuestions(q75);

        TriviaQuestions q76 = new TriviaQuestions( "Where is the headquarters of the ‘National AIDS Control Organisation " +
                "(NACO)’ located?",
                " Mumbai", "Delhi","Hyderabad","Kolkata",
                "Delhi");
        addQuestions(q76);

        TriviaQuestions q77 = new TriviaQuestions( "Which arm of the Indian Army is to recruit women as Pilots for the first" +
                " time from next year?",
                "Corps of Signals", "Armoured Corps","Army Aviation Corps","Corps of Engineers",
                "Army Aviation Corps");
        addQuestions(q77);


        TriviaQuestions q78 = new TriviaQuestions( "U.S. has recently named which country as the “State Sponsor of Terrorism”?",
                "Argentina", "Cuba","Chile","Brazil",
                "Cuba");
        addQuestions(q78);

        TriviaQuestions q79 = new TriviaQuestions( "The Leader of which country has been given a title of “General secretary” " +
                "of the ruling Workers’ Party?",
                "China", "North Korea","Thailand","Vietnam",
                "North Korea");
        addQuestions(q79);

        TriviaQuestions q80 = new TriviaQuestions( "The national initiative named “Kayakalp” was launched by which Ministry in 2015?",
                "Ministry of Science", "Ministry of Health and Family Welfare","Ministry of Agriculture","Ministry of Women and child development",
                "Ministry of Health and Family Welfare");
        addQuestions(q80);

        TriviaQuestions q81 = new TriviaQuestions( "The researchers of Durham University have developed a supercomputer simulation to " +
                "explain the formation of which space body?",
                "Moon", "Mars","Sun","Earth",
                "Moon");
        addQuestions(q81);

        TriviaQuestions q82 = new TriviaQuestions( "Who is/was the first U.S President to be impeached twice?",
                "Bill Clinton", "Andrew Johnson","Donald Trump","Ronald Reagan",
                "Donald Trump");
        addQuestions(q82);

        TriviaQuestions q83 = new TriviaQuestions( "Juri Ratas, who is seen in news recently, is the Prime Minister of which country?",
                "Bolivia", "Sweden","Estonia","Jamaica",
                "Estonia");
        addQuestions(q83);

        TriviaQuestions q84 = new TriviaQuestions( "Which Ministry has permitted to classify expenditure made on “Covid-19 vaccination " +
                "awareness” under CSR?",
                "Ministry of Home Affairs", "Ministry of Finance","Ministry of Health","Ministry of Corporate Affairs",
                "Ministry of Corporate Affairs");
        addQuestions(q84);

        TriviaQuestions q85 = new TriviaQuestions( "India’s first Labour Movement Museum is to be launched in which state/UT?",
                "Tamil Nadu", "Kerala","West Bengal","Andhra Pradesh",
                "Kerala");
        addQuestions(q85);

        TriviaQuestions q86 = new TriviaQuestions( "Ustad Ghulam Mustafa Khan, who passed away recently, was associated with which field?",
                "Literature", "Music","Sports","Business",
                "Music");
        addQuestions(q86);

        TriviaQuestions q87 = new TriviaQuestions( "What is the name of the veteran oncologist and Chairman of the Adyar Cancer Institute, " +
                "who recently passed away?",
                "K. V. Vijayadas", "Narendra Luther","V Shanta","Ghulam Mustafa Khan",
                "V Shanta");
        addQuestions(q87);

        TriviaQuestions q88 = new TriviaQuestions( "‘Chintan Baithak’ is the Brainstorming Conference cum Review Meeting of which Union" +
                " Ministry?",
                "Ministry of Communication", "Ministry of Culture","Minister of Ports, Shipping and Waterways",
                "Ministry of Tourism",
                "Minister of Ports, Shipping and Waterways");
        addQuestions(q88);

        TriviaQuestions q89 = new TriviaQuestions( "Which Public sector Unit has joined hands with Himachal Pradesh, to improve telecom " +
                "connectivity in the hilly areas?",
                "PFC Ltd", "PowerGrid","REC Ltd","GAIL Ltd",
                "PowerGrid");
        addQuestions(q89);

        TriviaQuestions q90 = new TriviaQuestions( "Which state has launched the door delivery programme for supply of ration to general " +
                "public?",
                "Tamil Nadu", "Kerala","Andhra Pradesh","Karnataka",
                "Andhra Pradesh");
        addQuestions(q90);

        TriviaQuestions q91 = new TriviaQuestions( "The socio-economic survey report of which state / UT has been released recently?",
                "Jammu and Kashmir", "Delhi","Uttar Pradesh","Madhya Pradesh",
                "Delhi");
        addQuestions(q91);

        TriviaQuestions q92 = new TriviaQuestions( "When is the statehood day of the three states of Meghalaya, Manipur & Tripura" +
                " celebrated?",
                "January 19", "January 21","January 23","January 25",
                "January 21");
        addQuestions(q92);

        TriviaQuestions q93 = new TriviaQuestions( "Which personality announced to give away USD 100 million for the best carbon " +
                "capture technology?",
                "Bill Gates", "Elon Musk","Mark Zuckerberg","Jack Ma",
                "Elon Musk");
        addQuestions(q93);

        TriviaQuestions q94 = new TriviaQuestions( "The Land Allotment Policy 2021-30, which was making news recently, was released" +
                " by which state/UT?",
                "Karnataka", "Kerala","Jammu& Kashmir","Gujarat",
                "Jammu& Kashmir");
        addQuestions(q94);

        TriviaQuestions q95 = new TriviaQuestions( "\"As per the release by Department of Science and Technology, what is India’s" +
                " position in number of scientific publications?",
                "First", "Third","Fifth","Tenth",
                "Third");
        addQuestions(q95);

        TriviaQuestions q96 = new TriviaQuestions( "The government of which state has decided to establish India’s biggest multi-model" +
                " logistics park?",
                "Maharashtra", "Tamil Nadu","West Bengal","Gujarat",
                "Gujarat");
        addQuestions(q96);

        TriviaQuestions q97 = new TriviaQuestions( "The government of which state has decided to establish India’s biggest multi-model " +
                "logistics park?",
                "Maharashtra", "Tamil Nadu","West Bengal","Gujarat",
                "Gujarat");
        addQuestions(q97);

        TriviaQuestions q98 = new TriviaQuestions( "‘Toshali National Crafts Mela’, which was making news recently, was organised in which " +
                "state/UT?",
                "Odisha", "Bihar","Uttarakhand","Andhra Pradesh",
                "Odisha");
        addQuestions(q98);

        TriviaQuestions q99 = new TriviaQuestions( "Mohammed Ishtaye, who was seen in the news recently, is the Prime Minister of which" +
                " country?",
                "Palestine", "Israel","Peru","Argentina",
                "Palestine");
        addQuestions(q99);

        TriviaQuestions q100 = new TriviaQuestions( "By which year, the Geological Survey of India (GSI) is set to complete National" +
                " Geochemical Mapping (NGCM) programme?",
                "2022", "2024","2025","2030",
                "2024");
        addQuestions(q100);

        TriviaQuestions q101 = new TriviaQuestions( "Marcelo Rebelo de Sousa has been re-elected as the President of which nation?",
                "Portugal", "Italy","Germany","France",
                "Portugal");
        addQuestions(q101);

        TriviaQuestions q102 = new TriviaQuestions( "“Kaja Kallas” is set to become the first women Prime Minster of which county?",
                "Indonesia", "Estonia","Jamaica","Brazil",
                "Estonia");
        addQuestions(q102);

       /* TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "What type of missile is “Akash-NG”, which was test-fired recently?\n" +
                        "[A] Surface to Surface Missile\n" +
                        "[B] Air to Air Missile\n" +
                        "[C] Anti-Tank Missile\n" +
                        "[D] Surface to Air Missile\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: D [Surface to Air Missile]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Alpha Global, which was making news recently, is the Union alliance of which tech company?\n" +
                        "[A] Microsoft\n" +
                        "[B] Alphabet\n" +
                        "[C] Apple\n" +
                        "[D] Amazon\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Alphabet]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which country announced a pledge of USD 150,000 for UN peace building operations?\n" +
                        "[A] China\n" +
                        "[B] India\n" +
                        "[C] Japan\n" +
                        "[D] Germany\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [India");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which Indian city recently unveiled a first-of-its kind Young Readers’ Boat Library?\n" +
                        "[A] Mumbai\n" +
                        "[B] Kolkata\n" +
                        "[C] Ahmedabad\n" +
                        "[D] Cochin\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Kolkata");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Giant Metre-wave Radio Telescope, which was making news recently, is located in which Indian state?\n" +
                        "[A] Madhya Pradesh\n" +
                        "[B] Gujarat\n" +
                        "[C] Maharashtra\n" +
                        "[D] Karnataka\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [Maharashtra]\n" +
                        "Notes:");
        addQuestions(q);


        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "As per the recent statement of the WHO, which country recorded the highest reduction in Malaria cases, in South-East Asia?\n" +
                        "[A] China\n" +
                        "[B] India\n" +
                        "[C] Sri Lanka\n" +
                        "[D] Bangladesh\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [India");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which state has launched an outreach programme called ‘Duare Sarkar’?\n" +
                        "[A] Odisha\n" +
                        "[B] West Bengal\n" +
                        "[C] Chhattisgarh\n" +
                        "[D] Jharkhand\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [West Bengal");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "‘Dev Deepawali’ festival is celebrated in which Indian city?\n" +
                        "[A] Varanasi\n" +
                        "[B] Haridwar\n" +
                        "[C] Rishikesh\n" +
                        "[D] Gangotri\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: A [Varanasi]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which Indian bank co-launched a Contactless debit card along with Japan’s JCB International?\n" +
                        "[A] Punjab National Bank\n" +
                        "[B] State Bank of India\n" +
                        "[C] HDFC Bank\n" +
                        "[D] Axis Bank\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [State Bank of India]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which Indian PSU has launched the country’s first 100 Octane petrol?\n" +
                        "[A] HPCL\n" +
                        "[B] IOC\n" +
                        "[C] ONGC\n" +
                        "[D] GAIL\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [IOC");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "In which state, the first ever virtual edition of Aadi Mahotsav is celebrated?\n" +
                        "[A] Uttar Pradesh\n" +
                        "[B] Madhya Pradesh\n" +
                        "[C] Maharashtra\n" +
                        "[D] Assam\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Madhya Pradesh]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which country has recently declared a climate emergency and pledged to become carbon neutral by 2025?\n" +
                        "[A] USA\n" +
                        "[B] Netherlands\n" +
                        "[C] New Zealand\n" +
                        "[D] Australia\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [New Zealand");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "The Asian Development Bank (ADB) is to finance USD 50 million policy-based loan for Finance Management in which state?\n" +
                        "[A] Maharashtra\n" +
                        "[B] West Bengal\n" +
                        "[C] Andhra Pradesh\n" +
                        "[D] Tamil Nadu\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [West Bengal]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "‘The 18th-century idol of Goddess Annapurna’, which was stolen from Varanasi, is being returned by which country?\n" +
                        "[A] United Kingdom\n" +
                        "[B] Canada\n" +
                        "[C] Russia\n" +
                        "[D] Brazil\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Canada");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Mamit district, which topped the Niti Aayog’s October rankings of aspirational districts, is in which state?\n" +
                        "[A] Assam\n" +
                        "[B] Sikkim\n" +
                        "[C] Mizoram\n" +
                        "[D] Madhya Pradesh\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [Mizoram]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "“Jiuzhang” is the quantum computer developed by which country?\n" +
                        "[A] New Zealand\n" +
                        "[B] Japan\n" +
                        "[C] China\n" +
                        "[D] Thailand\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [China");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which country topped the Climate Change Performance Index (CCPI)?\n" +
                        "[A] United Kingdom\n" +
                        "[B] Norway\n" +
                        "[C] Sweden\n" +
                        "[D] Denmark\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [Sweden");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which country rolled out the first vaccine in the world?\n" +
                        "[A] United States\n" +
                        "[B] New Zealand\n" +
                        "[C] United Kingdom\n" +
                        "[D] Germany\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [United Kingdom");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "“The Presidential Years”, which was seen in the news recently, is the memoir of which Indian President?\n" +
                        "[A] Pratibha Patel\n" +
                        "[B] Pranab Mukherjee\n" +
                        "[C] Ramnath Kovind\n" +
                        "[D] A P J Abdul Kalam\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Pranab Mukherjee");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "National poet ‘Subramaniya Bharati’ is a famous poet of which Indian state?\n" +
                        "[A] Kerala\n" +
                        "[B] Tamil Nadu\n" +
                        "[C] Andhra Pradesh\n" +
                        "[D] Karnataka\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Tamil Nadu");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which institution has revealed that droughts occurring in India are due to atmospheric disturbances from the North Atlantic region?\n" +
                        "[A] MIT\n" +
                        "[B] IISc\n" +
                        "[C] IIT Bombay\n" +
                        "[D] ISRO\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [IISc]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "When is the Universal Health Coverage Day observed every year?\n" +
                        "[A] December 5\n" +
                        "[B] December 10\n" +
                        "[C] December 12\n" +
                        "[D] December 15\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [December 12]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which is the first Indian state is to roll out an online mechanism for Fire safety approval, named ‘Fire Safety COP’?\n" +
                        "[A] Tamil Nadu\n" +
                        "[B] Kerala\n" +
                        "[C] Gujarat\n" +
                        "[D] Odisha\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [Gujarat");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "What is the name of the promotional activity of the India International Science Festival, which is in the news recently?\n" +
                        "[A] Vigyan Yatra\n" +
                        "[B] Vigyan Parikshit\n" +
                        "[C] Vigyan Sammelan\n" +
                        "[D] Vigyan Festival\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: A [Vigyan Yatra]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "As per the recent study of CEEW, what is the per centage of Indian districts that are hotspots of extreme climate events?\n" +
                        "[A] 25\n" +
                        "[B] 50\n" +
                        "[C] 75\n" +
                        "[D] 90\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: C [75]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "Which company has won the bid to construct the India’s Parliament building?\n" +
                        "[A] Adani Group\n" +
                        "[B] Tata Projects\n" +
                        "[C] GMR Projects\n" +
                        "[D] BGR Infrastructure\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [Tata Projects]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "The United Nations International Children’s Emergency Fund was formed by the UNGA in which year?\n" +
                        "[A] 1940\n" +
                        "[B] 1946\n" +
                        "[C] 1952\n" +
                        "[D] 1965\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: B [1946]");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "What is the name of the initiative of India, to launch movie series for the Shanghai Cooperation Organisation diplomats?\n" +
                        "[A] CinemaSCOpe\n" +
                        "[B] IndiaSCOpe\n" +
                        "[C] KaleidoSCOpe\n" +
                        "[D] SCOre\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: A [CinemaSCOpe]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "What is the name of the Meteor that originates from 3200 Phaethon Asteroid, and is visible in Earth as a meteor shower?\n" +
                        "[A] Geminids meteor\n" +
                        "[B] Granade meteor\n" +
                        "[C] Ignius meteor\n" +
                        "[D] Helios meteor\n" +
                        "\n" +
                        "Hide Answer\n" +
                        "\n" +
                        "Correct Answer: A [Geminids meteor]\n" +
                        "Notes:");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "");
        addQuestions(q);
        TriviaQuestions q = new TriviaQuestions( "",
                "", "","","",
                "");
        addQuestions(q);

        */





    }

    public ArrayList<TriviaQuestions> getAllQuestions(){

        ArrayList<TriviaQuestions> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };

        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null,
                null
                );

        if (c.moveToFirst()) // -1 > 0
        {
            do{

                TriviaQuestions questions = new TriviaQuestions();
                questions.setQuestion(c.getString(c.getColumnIndex( QuestionTable.COLUMN_QUESTION)));
                questions.setOption1(c.getString(c.getColumnIndex( QuestionTable.COLUMN_OPTION1)));
                questions.setOption2(c.getString(c.getColumnIndex( QuestionTable.COLUMN_OPTION2)));
                questions.setOption3(c.getString(c.getColumnIndex( QuestionTable.COLUMN_OPTION3)));
                questions.setOption4(c.getString(c.getColumnIndex( QuestionTable.COLUMN_OPTION4)));
                questions.setAnswerNr(c.getString(c.getColumnIndex( QuestionTable.COLUMN_ANSWER_NR)));
                questionList.add(questions);



            }while (c.moveToNext());

        }
        c.close();
        return questionList;
    }


}
