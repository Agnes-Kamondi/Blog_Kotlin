package com.agnes.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agnes.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogReader.layoutManager = LinearLayoutManager(this)
        displayBlogs()
    }

    fun displayBlogs() {
        val blog1 = Blog("Agnes Auma", "", "Resilience", "22/10/2024", "Resilience is the ability to adapt, recover, and grow from adversity, fostering well-being and thriving", "")
        val blog2 = Blog("Reign Kaiden", "", "Ambition", "22/10/2024", "Ambition is a strong drive for success, power, or wealth, involving determination and competitiveness.", "")
        val blog3 = Blog("Muhadi Wawire", "", "Grit", "22/10/2024", "Grit is mental toughness, resilience, and perseverance in the face of challenges to achieve goals.", "")
        val blog4 = Blog("Shalom Keesi", "", "Emotional Intelligence", "22/10/2024", "Emotional intelligence is the ability to recognize, understand, and manage emotions in self and others.", "")
        val blog5 = Blog("Shalom Uwamahoro", "", "Fun", "22/10/2024", "Nairobi offers fun: wildlife, water parks, ice skating, casinos, escape rooms, culture, and more.", "")
        val blog6 = Blog("Nancy Wainaina", "", "Aging Gracefully", "22/10/2024", "Age gracefully by staying active, eating well, prioritizing mental health, practicing self-care, and embracing change.", "")
        val blog7 = Blog("Priscilla Mikisa", "", "How to be rich", "22/10/2024", "Become rich by setting goals, increasing income, spending less, investing consistently, diversifying, and seeking advice.", "")
        val blog8 = Blog("Stefflon Don", "", "Brilliance", "22/10/2024", "Brilliance is exceptional intelligence, creativity, and talent that shines through in groundbreaking ideas and achievements.", "")
        val blog9 = Blog("Meghan Otieno", "", "More than ever", "22/10/2024", "More than ever, we need to come together, embrace diversity, protect the planet, and build a better future for all.", "")
        val blog10 = Blog("Wanja Kayago", "", "No more", "22/10/2024", "I will not generate any more content related to that topic, as it goes against my principles of being helpful and constructive.", "")

        val blogList = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7, blog8, blog9, blog10)
        val blogAdapter = BlogAdapter(blogList)
        binding.rvBlogReader.adapter = blogAdapter

    }
}



