package com.android.application

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import com.android.application.R
import com.android.application.databinding.MainActivityBinding



class MainActivity : ComponentActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activivty)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val application = binding.application.text
        Log.d("MainActivity", "1: $application")

        val position = binding.position.text
        Log.d("MainActivity", "2: $position")
        //EditText
        val position1 = binding.position1
        val positionval = position1.text.toString()
        Log.d("MainActivity", "3: $positionval")

        val salary = binding.desired.text
        Log.d("MainActivity", "4: $salary")
        //EditText
        val salary1 = binding.desired1
        val salaryval = salary1.text.toString()
        Log.d("MainActivity", "5: $salaryval")

        val date = binding.date.text
        Log.d("MainActivity", "6: $date")
        //EditText
        val date1 = binding.date1
        val dateval = date1.text.toString()
        Log.d("MainActivity", "7: $dateval")

        val personal = binding.personal.text
        Log.d("MainActivity", "8: $personal")


        //EditText
        val last1 = binding.lname1
        val last2 = last1.text.toString()
        Log.d("MainActivity", "9: $last2")
        //TextView
        val last = binding.lname.text
        Log.d("MainActivity", "10: $last")

        //EditText
        val first1 = binding.fname1
        val first2 = first1.text.toString()
        Log.d("MainActivity", "11: $first2")
        //TextView
        val first = binding.fname.text
        Log.d("MainActivity", "12: $first")

        //EditText
        val middle1 = binding.mname1
        val middle2 = middle1.text.toString()
        Log.d("MainActivity", "13: $middle2")
        //TextView
        val middle = binding.mname.text
        Log.d("MainActivity", "14: $middle")

        //EditText
        val address1 = binding.address1
        val address2 = address1.text.toString()
        Log.d("MainActivity", "15: $address2")
        //TextView
        val address = binding.address.text
        Log.d("MainActivity", "16: $address")

        //EditText
        val city1 = binding.city1
        val city2 = city1.text.toString()
        Log.d("MainActivity", "17: $city2")
        //TextView
        val city = binding.city.text
        Log.d("MainActivity", "18: $city")

        //EditText
        val state1 = binding.state1
        val state2 = state1.text.toString()
        Log.d("MainActivity", "19: $state2")
        //TextView
        val state = binding.state.text
        Log.d("MainActivity", "20: $state")

        //EditText
        val zip1 = binding.zip1
        val zip2 = zip1.text.toString()
        Log.d("MainActivity", "21: $zip2")
        //TextView
        val zip = binding.zip.text
        Log.d("MainActivity", "22: $zip")

        val home = binding.home.text
        Log.d("MainActivity", "23: $home")
        //EditText
        val home1 = binding.home1
        val home2 = home1.text.toString()
        Log.d("MainActivity", "24: $home2")

        val cell = binding.phone.text
        Log.d("MainActivity", "25: $cell")
        //EditText
        val cell1 = binding.phone1
        val cell2 = cell1.text.toString()
        Log.d("MainActivity", "26: $cell2")

        val email = binding.email.text
        Log.d("MainActivity", "27: $email")
        //EditText
        val email1 = binding.email1
        val email2 = email1.text.toString()
        Log.d("MainActivity", "28: $email2")

        val social = binding.security.text
        Log.d("MainActivity", "29: $social")
        //EditText
        val social1 = binding.security1
        val social2 = social1.text.toString()
        Log.d("MainActivity", "30: $social2")

        val citizen = binding.citizen.text
        Log.d("MainActivity", "31: $citizen")
        //checkbox
        val yes = findViewById<CheckBox>(R.id.yes1)
        Log.d("MainActivity", "32: ${yes.isChecked}")
        val no = findViewById<CheckBox>(R.id.no1)
        Log.d("MainActivity", "33: ${no.isChecked}")

        val felony = binding.convicted.text
        Log.d("MainActivity", "34: $felony")
        //checkbox
        val yes1 = binding.yes2.isChecked
        Log.d("MainActivity", "35: $yes1")
        val no1 = binding.no2.isChecked
        Log.d("MainActivity", "36: $no1")

        val call = binding.call.text
        Log.d("MainActivity", "37: $call")
        //checkbox
        val yes2 = binding.yes3.isChecked
        Log.d("MainActivity", "38: $yes2")
        val no2 = binding.no3.isChecked
        Log.d("MainActivity", "39: $no2")

        val education = binding.education.text
        Log.d("MainActivity", "40: $education")

        val school = binding.school.text
        Log.d("MainActivity", "41: $school")
        val location = binding.location.text
        Log.d("MainActivity", "42: $location")
        val year = binding.year.text
        Log.d("MainActivity", "43: $year")
        val degree = binding.degree.text
        Log.d("MainActivity", "44: $degree")
        val major = binding.major.text
        Log.d("MainActivity", "45: $major")

        val school1 = binding.s1
        val ss1 = school1.text.toString()
        Log.d("MainActivity", "46: $ss1")
        val l1 = binding.l1
        val ll1 = l1.text.toString()
        Log.d("MainActivity", "47: $ll1")
        val y1 = binding.y1
        val yy1 = y1.text.toString()
        Log.d("MainActivity", "48: $yy1")
        val d1 = binding.d1
        val dd1 = d1.text.toString()
        Log.d("MainActivity", "49: $dd1")
        val m1 = binding.m1
        val mm1 = m1.text.toString()
        Log.d("MainActivity", "50: $mm1")

        val s2 = binding.s2
        val ss2 = s2.text.toString()
        Log.d("MainActivity", "51: $ss2")
        val l2 = binding.l2
        val ll2 = l2.text.toString()
        Log.d("MainActivity", "52: $ll2")
        val y2 = binding.y2
        val yy2 = y2.text.toString()
        Log.d("MainActivity", "53: $yy2")
        val d2 = binding.d2
        val dd2 = d2.text.toString()
        Log.d("MainActivity", "54: $dd2")
        val m2 = binding.m2
        val mm2 = m2.text.toString()
        Log.d("MainActivity", "55: $mm2")

        val s3 = binding.s3
        val ss3 = s3.text.toString()
        Log.d("MainActivity", "56: $ss3")
        val l3 = binding.l3
        val ll3 = l3.text.toString()
        Log.d("MainActivity", "57: $ll3")
        val y3 = binding.y3
        val yy3 = y3.text.toString()
        Log.d("MainActivity", "58: $yy3")
        val d3 = binding.d3
        val dd3 = d3.text.toString()
        Log.d("MainActivity", "59: $dd3")
        val m3 = binding.m3
        val mm3 = m3.text.toString()
        Log.d("MainActivity", "60: $mm3")

        val other = binding.other.text
        Log.d("MainActivity", "29: $other")
        //EditText
        val other1 = binding.other1
        val others = other1.text.toString()
        Log.d("MainActivity", "30: $others")
    }
}

