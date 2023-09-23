/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccao;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.COLOR_BGR2GRAY;
import org.opencv.objdetect.CascadeClassifier;

/**
 *
 * @author sabri
 */
public class Exemplo1 {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat imgColor = imread("src\\pessoas\\pessoas1.jpg");
        Mat imgCinza = new Mat();
        Imgproc.cvtColor(imgColor, imgCinza, COLOR_BGR2GRAY);
        
        CascadeClassifier classificador = new CascadeClassifier("src\\cascades\\haarcascade_frontalface_default.xml");
        MatOfRect facesDetectadas = new  MatOfRect();
        
        classificador.detectMultiScale(imgCinza,facesDetectadas
        //1.1,
        //1,
        //0,
        //new Size(30,30),
        //new Size(100,100)
        );
        System.out.println(facesDetectadas.toArray().length);
        
        for(Rect rect :facesDetectadas.toArray()){
            System.out.println(rect.x+" "+rect.y+" "+rect.width+" "+rect.height+" ");
            Imgproc.rectangle(imgColor, 
                new Point(rect.x,rect.y),
                new Point(rect.x+rect.width,rect.y+rect.height),
                new Scalar(0,0,255),
        2
            );
        }
        Utilitarios ut = new Utilitarios();
        ut.mostraImagem(ut.convertMatToImage(imgColor));
        
    }
}
