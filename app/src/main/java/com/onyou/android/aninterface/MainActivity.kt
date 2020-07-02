package com.onyou.android.aninterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), InputToast {
    override fun toastWithInput(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment =  BlankFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()

        fragment.interfaceTest = this

        /**
         *   공통 :
         *    1. 특정 타이밍에 함수 콜이 필요한 클래스에서 인터페이스 선언 ( blank fragment )
         */

        /**
         *  case A :
         *
         *  2. 함수를 구현해줄 클래스에서 상속 및 오버라이딩 / 초기화 ( main activity )
         *  3. 특정 타이밍에 함수 호출 ( blank fragment )
         */

    }
}
