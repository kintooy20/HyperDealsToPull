package com.example.kent.hyperdeals.Admin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import com.example.kent.hyperdeals.R
import kotlinx.android.synthetic.main.activity_add_category_input.*

class AddCategoryInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_category_input)


        btn_add_category_and_subcategory.setOnClickListener{

            addcategoryimage.visibility = VISIBLE
            addcategoryname.visibility = VISIBLE
            addsubcategoryname.visibility = VISIBLE


        }

        btn_addcategory_only.setOnClickListener{



        }

        btn_add_subcategory_only.setOnClickListener{



        }
    }
}
