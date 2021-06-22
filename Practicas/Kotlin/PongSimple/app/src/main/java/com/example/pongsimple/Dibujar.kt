package com.example.pongsimple

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.CountDownTimer
import android.view.View


class Dibujar(p:MainActivity): View(p)
{
var toque=false
    var xd=50f
    var yd=50f
    var arriba= false

override fun onDraw(c: Canvas)
{
  
        object : CountDownTimer(200, 100) {
            override fun onTick(millisUntilFinished: Long) {
                if (!arriba) {
                    //xd+=20f
                    yd += 20f
                    colision(yd, xd)

                }

                if (arriba) {
                    //xd+=20f
                    yd -= 20f
                    colision(yd, xd)

                }
              invalidate()
            }
            override fun onFinish() {

            }

        }.start()



    super.onDraw(c)
    val p= Paint()
    c.drawColor(Color.BLACK)
    p.color= Color.BLUE
    c.drawCircle(xd, yd, 23f,p)
    p.color= Color.RED
    c.drawRoundRect(RectF(100f, 60f, 300f, 20f), 6f, 6f, p)
    p.color= Color.GREEN
    c.drawRoundRect(RectF(100f, 2060f, 300f, 2100f), 6f, 6f, p)
    }

    private fun colision(y: Float,x: Float) {
       if (yd>=2340)
       {
           yd= 2340F

           arriba=true
       }
        if (yd<=0)
        {
            yd= 0F

            arriba =false
        }

    }

}