/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccao;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_REDUCED_GRAYSCALE_2;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_REDUCED_GRAYSCALE_4;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import org.opencv.imgproc.Imgproc;
/**
 *
 * @author sabri
 */
public class TesteOpencv {/*
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(Core.VERSION);
        
        Mat imagemColorida = imread("src\\deteccao\\kimetsu.jpg",IMREAD_COLOR);
        
        Utilitarios ut = new Utilitarios();
        ut.mostraImagem(ut.convertMatToImage(imagemColorida));
        
        Mat imgCinza = new Mat();
        
        Imgproc.cvtColor(imagemColorida, imgCinza, IMREAD_REDUCED_GRAYSCALE_4);
        ut.mostraImagem(ut.convertMatToImage(imgCinza));

    }*/
          
}
