package mx.edu.ittepic.ladm_u2_practica2_irvingdiaz

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    var circulo = FiguraGeometrica(150, 1000, 120)
    var circulo2 = FiguraGeometrica(500, 1400, 180)
    var circulo3 = FiguraGeometrica(250, 1300, 136)
    var circulo4 = FiguraGeometrica(169, 1600, 9)
    var circulo5 = FiguraGeometrica(248, 700, 300)
    var circulo6 = FiguraGeometrica(300, 1900, 310)
    var circulo7 = FiguraGeometrica(1000, 100, 6)
    var circulo8 = FiguraGeometrica(950, 300, 69)
    var circulo9 = FiguraGeometrica(30, 600, 170)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)

        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo2.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo3.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo4.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo5.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.GRAY
        circulo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo6.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.MAGENTA
        circulo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo7.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.CYAN
        circulo8.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo8.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.DKGRAY
        circulo9.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo9.pintar(canvas, paint)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
            MotionEvent.ACTION_MOVE -> {

            }
            MotionEvent.ACTION_UP -> {
            }
        }
        invalidate()
        return true
    }

    fun animarCirculo() {
        circulo2.rebote(width, height)
        circulo.rebote(width, height)
        circulo3.rebote(width, height)
        circulo4.rebote(width, height)
        circulo5.rebote(width, height)
        circulo6.rebote(width, height)
        circulo7.rebote(width, height)
        circulo8.rebote(width, height)
        circulo9.rebote(width, height)
        invalidate()
    }

}