package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_ questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Mexico", "Armenia",
            1

        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kenya,
            "Nigeria", "Egypt",
            "Kenya", "South Sudan",
            3

        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "Papua New Gunnie",
            "Belgium", "Comoros",
            3

        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Chile", "Brazil",
            "Colombia", "Bolivia",
            2

        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia", "Iceland",
            "United Kingdom", "USA",
            1

        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium", "South Africa",
            "Ghana", "Germany",
            4

        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Pakistan", "Iran",
            "India", "Thailand",
            3

        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_burundi,
            "Burundi", "Botswana",
            "Rwanda", "Namibia",
            1

        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_congo_republic,
            "Malawi", "Mozambique",
            "Congo Republic", "Zambia",
            3

        )
        questionsList.add(que1)

        return questionsList
    }
}