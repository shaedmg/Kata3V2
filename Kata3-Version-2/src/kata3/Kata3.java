package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<>();
        
        for(int i = 0; i <= 15; i++) histogram.increment("ulpgc.es");
        
        for(int i = 0; i <= 8; i++) histogram.increment("ull.es");
        
        for(int i = 0; i <= 2; i++) histogram.increment("hotmail.com");
        
        for(int i = 0; i <= 6; i++) histogram.increment("gmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }    
}
