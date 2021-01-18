package com.codingwithjks.piano

import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt
import uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds.RectanglePromptBackground
import uk.co.samuelwall.materialtaptargetprompt.extras.focals.RectanglePromptFocal

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var c3 =0
    private var c3Black:Int = 0
    private var d3:Int = 0
    private var d3Black:Int = 0
    private var e3:Int = 0
    private var f3:Int = 0
    private var f3Black:Int = 0
    private var g3:Int = 0
    private var g3Black:Int = 0
    private var a3:Int = 0
    private var a3Black:Int = 0
    private var b3:Int = 0
    private var c4 = 0
    private var c4Black:Int = 0
    private var d4:Int = 0
    private var d4Black:Int = 0
    private var e4:Int = 0
    private var f4:Int = 0
    private var f4Black:Int = 0
    private var g4:Int = 0
    private var g4Black:Int = 0
    private var a4:Int = 0
    private var a4Black:Int = 0
    private var b4:Int = 0
    private var c5 = 0
    private var c5Black:Int = 0
    private var d5:Int = 0
    private var d5Black:Int = 0
    private var e5:Int = 0
    private var f5:Int = 0
    private var f5Black:Int = 0
    private var g5:Int = 0
    private var g5Black:Int = 0
    private var a5:Int = 0
    private var a5Black:Int = 0
    private var b5:Int = 0
    private var c6 = 0
    private var c6Black:Int = 0
    private var d6:Int = 0
    private var d6Black:Int = 0
    private var e6:Int = 0
    private var f6:Int = 0
    private var f6Black:Int = 0
    private var g6:Int = 0
    private var g6Black:Int = 0
    private var a6:Int = 0
    private var a6Black:Int = 0
    private var b6:Int = 0
    private var c7 = 0
    private var c7Black:Int = 0
    private var d7:Int = 0
    private var d7Black:Int = 0
    private var e7:Int = 0
    private var f7:Int = 0
    private var f7Black:Int = 0
    private var g7:Int = 0
    private var g7Black:Int = 0
    private var a7:Int = 0
    private var a7Black:Int = 0
    private var b7:Int = 0
    private lateinit var soundPool:SoundPool

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        soundPool=SoundPool.Builder().setMaxStreams(6).build()
        sounds()
        setListener()
        showFabPrompt()
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.tc3-> soundPool.play(c3, 1f, 1f, 0, 0, 1f)
            R.id.p1 -> soundPool.play(c3, 1f, 1f, 0, 0, 1f)




            R.id.td3-> soundPool.play(d3, 1f, 1f, 0, 0, 1f)
            R.id.p2 -> soundPool.play(d3, 1f, 1f, 0, 0, 1f)



            R.id.te3->soundPool.play(e3, 1f, 1f, 1, 0, 1f)
            R.id.p3-> soundPool.play(e3, 1f, 1f, 1, 0, 1f)

            R.id.tf3->  soundPool.play(f3, 1f, 1f, 0, 0, 1f)
            R.id.p4-> soundPool.play(f3, 1f, 1f, 0, 0, 1f)



            R.id.tg3->           soundPool.play(g3, 1f, 1f, 0, 0, 1f)
            R.id.p5-> soundPool.play(g3, 1f, 1f, 0, 0, 1f)



            R.id.ta3->soundPool.play(a3, 1f, 1f, 0, 0, 1f)
            R.id.p6->soundPool.play(a3, 1f, 1f, 0, 0, 1f)





            R.id.tb3->  soundPool.play(b3, 1f, 1f, 0, 0, 1f)
            R.id.p7-> soundPool.play(b3, 1f, 1f, 0, 0, 1f)

            R.id.tc4->  soundPool.play(c4, 1f, 1f, 0, 0, 1f)
            R.id.p8-> soundPool.play(c4, 1f, 1f, 0, 0, 1f)




             R.id.td4->soundPool.play(d4, 1f, 1f, 0, 0, 1f)
             R.id.p9-> soundPool.play(d4, 1f, 1f, 0, 0, 1f)




             R.id.te4-> soundPool.play(e4, 1f, 1f, 0, 0, 1f)
             R.id.p10-> soundPool.play(e4, 1f, 1f, 0, 0, 1f)

             R.id.tf4->soundPool.play(f4, 1f, 1f, 0, 0, 1f);
             R.id.p11->soundPool.play(f4, 1f, 1f, 0, 0, 1f);





              R.id.tg4->soundPool.play(g4, 1f, 1f, 0, 0, 1f)
              R.id.p12->soundPool.play(g4, 1f, 1f, 0, 0, 1f)


              R.id.p13->soundPool.play(a4, 1f, 1f, 0, 0, 1f)


        }
    }

    private fun sounds()
    {
        c3 = soundPool.load(this, R.raw.c3, 1);
        c3Black = soundPool.load(this, R.raw.c3black, 1);
        e3 = soundPool.load(this, R.raw.e3, 1);
        f3 = soundPool.load(this, R.raw.f3, 1);
        f3Black = soundPool.load(this, R.raw.f3black, 1);
        g3 = soundPool.load(this, R.raw.g3, 1);
        g3Black = soundPool.load(this, R.raw.g3black, 1);
        d3 = soundPool.load(this, R.raw.d3, 1);
        d3Black = soundPool.load(this, R.raw.d3black, 1);
        a3 = soundPool.load(this, R.raw.a3, 1);
        a3Black = soundPool.load(this, R.raw.a3black, 1);
        b3 = soundPool.load(this, R.raw.b3, 1);

        c4 = soundPool.load(this, R.raw.c4, 1);
        c4Black = soundPool.load(this, R.raw.c4black, 1);
        e4 = soundPool.load(this, R.raw.e4, 1);
        f4 = soundPool.load(this, R.raw.f4, 1);
        f4Black = soundPool.load(this, R.raw.f4black, 1);
        g4 = soundPool.load(this, R.raw.g4, 1);
        g4Black = soundPool.load(this, R.raw.g4black, 1);
        d4 = soundPool.load(this, R.raw.d4, 1);
        d4Black = soundPool.load(this, R.raw.d4black, 1);
        a4 = soundPool.load(this, R.raw.a4, 1);
        a4Black = soundPool.load(this, R.raw.a4black, 1);
        b4 = soundPool.load(this, R.raw.b4, 1);

        c5 = soundPool.load(this, R.raw.c5, 1);
        c5Black = soundPool.load(this, R.raw.c5black, 1);
        e5 = soundPool.load(this, R.raw.e5, 1);
        f5 = soundPool.load(this, R.raw.f5, 1);
        f5Black = soundPool.load(this, R.raw.f5black, 1);
        g5 = soundPool.load(this, R.raw.g5, 1);
        g5Black = soundPool.load(this, R.raw.g5black, 1);
        d5 = soundPool.load(this, R.raw.d5, 1);
        d5Black = soundPool.load(this, R.raw.d5black, 1);
        a5 = soundPool.load(this, R.raw.a5, 1);
        a5Black = soundPool.load(this, R.raw.a5black, 1);
        b5 = soundPool.load(this, R.raw.b5, 1);

        c6 = soundPool.load(this, R.raw.c6, 1);
        c6Black = soundPool.load(this, R.raw.c6black, 1);
        e6 = soundPool.load(this, R.raw.e6, 1);
        f6 = soundPool.load(this, R.raw.f6, 1);
        f6Black = soundPool.load(this, R.raw.f6black, 1);
        g6 = soundPool.load(this, R.raw.g6, 1);
        g6Black = soundPool.load(this, R.raw.g6black, 1);
        d6 = soundPool.load(this, R.raw.d6, 1);
        d6Black = soundPool.load(this, R.raw.d6black, 1);
        a6 = soundPool.load(this, R.raw.a6, 1);
        a6Black = soundPool.load(this, R.raw.a6black, 1);
        b6 = soundPool.load(this, R.raw.b6, 1);

        c7 = soundPool.load(this, R.raw.c7, 1);
        c7Black = soundPool.load(this, R.raw.c7black, 1);
        e7 = soundPool.load(this, R.raw.e7, 1);
        f7 = soundPool.load(this, R.raw.f7, 1);
        f7Black = soundPool.load(this, R.raw.f7black, 1);
        g7 = soundPool.load(this, R.raw.g7, 1);
        g7Black = soundPool.load(this, R.raw.g7black, 1);
        d7 = soundPool.load(this, R.raw.d7, 1);
        d7Black = soundPool.load(this, R.raw.d7black, 1);
        a7 = soundPool.load(this, R.raw.a7, 1);
        a7Black = soundPool.load(this, R.raw.a7black, 1);
        b7 = soundPool.load(this, R.raw.b7, 1);

    }

    private fun setListener()
    {
        p1.setOnClickListener(this)
        p2.setOnClickListener(this)
        p3.setOnClickListener(this)
        p4.setOnClickListener(this)
        p5.setOnClickListener(this)
        p6.setOnClickListener(this)
        p7.setOnClickListener(this)
        p8.setOnClickListener(this)
        p9.setOnClickListener(this)
        p10.setOnClickListener(this)
        p11.setOnClickListener(this)
        p12.setOnClickListener(this)
        p13.setOnClickListener(this)

    }

    private fun showFabPrompt(){
        val prefManager = PreferenceManager.getDefaultSharedPreferences(this)
        if(!prefManager.getBoolean("didShowPrompt",false)){
            MaterialTapTargetPrompt.Builder(this)
                .setTarget(p1)
                .setPrimaryText("Press Me!")
                .setSecondaryText("This Button is Piano Tuts. Press to make some sound!")
                .setBackButtonDismissEnabled(true)
                .setPromptBackground(RectanglePromptBackground())
                .setPromptFocal(RectanglePromptFocal())
                .setPromptStateChangeListener{_, state ->
                    if(state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED ||
                            state == MaterialTapTargetPrompt.STATE_NON_FOCAL_PRESSED){
                        val prefEdit = prefManager.edit()
                        prefEdit.putBoolean("didShowPrompt",true).apply()
                        showButtonprompt()
                    }
                }.show()
        }
    }

    private fun showButtonprompt(){
        MaterialTapTargetPrompt.Builder(this)
            .setTarget(p2)
            .setPrimaryText("Press Me!")
            .setBackButtonDismissEnabled(true)
            .setSecondaryText("Another Piano Tuts. Press the other button so you can play the piano!!")
            .setPromptBackground(RectanglePromptBackground())
            .setPromptFocal(RectanglePromptFocal())
            .show()
    }
}

