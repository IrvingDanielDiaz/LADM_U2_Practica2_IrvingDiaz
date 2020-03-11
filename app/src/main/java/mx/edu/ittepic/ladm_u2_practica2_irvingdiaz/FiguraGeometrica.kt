package mx.edu.ittepic.ladm_u2_practica2_irvingdiaz

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo 3 BITMAP
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 3
    var incY = 3
    var res :Resources?=null
    var icono : Bitmap?=null

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        // dando valor a ancho y alto para tratar circulo como cuadrado
        ancho = this.radio*2
        alto = ancho
        if(radio<10){
            incX = 32
            incY = 32
        }else if(radio <80){
            incX = 20
            incY= 20
        }else if(radio<160){
            incX = 12
            incY = 12
        }else if(radio<200){
            incX = 6
            incY = 6
        }else if(radio<300){
            incX = 3
            incY = 3
        }else{
            incX = 1
            incY = 1
        }


    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }

    constructor(x:Int, y:Int,b : Bitmap) : this(){
        this.icono = b
        this.x = x.toFloat()
        this.y = y.toFloat()
        ancho = icono!!.width.toFloat()
        alto = icono!!.height.toFloat()
        tipo = 3


    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
            3->{
                c.drawBitmap(icono!!,x,y,p)
            }
        }
    }

    fun estaEnArea(event: MotionEvent):Boolean{
        if(event.x >= x && event.x<=x+ancho){
            if(event.y >= y && event.y<=y+alto){
                return true
            }
        }
        return false
    }

    fun estaEnArea(posX : Float, posY : Float):Boolean{
        if(posX >= x && posX<=x+ancho){
            if(posY >= y && posY<=y+alto){
                return true
            }
        }
        return false
    }

    fun arrastrar(event: MotionEvent){
        x = event.x - (ancho/2)
        y = event.y - (alto/2)
    }

    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }



}