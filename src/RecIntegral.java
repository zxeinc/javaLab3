/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RecIntegral {
    public double start;
    public double end;
    public double step;
    public double result ;

    public RecIntegral(){

    }

    public RecIntegral(double _start, double _end, double _step) throws valueException{
        if(CheckMaxMin(_start, 0.000001, 1000000) &&
           CheckMaxMin(_end, 0.000001, 1000000)&&
           CheckMaxMin(_step, 0.000001, 1000000))
        {
                    start = _start;
                    end = _end;
                    step = _step;
        
//        if (start < 0.000001 || start > 1000000 || end < 0.000001 || end > 1000000 || step < 0.000001 || step > 1000000) {
//            throw new valueException("value is incorrect");
//        }
        }
        else {
           throw new valueException("value is incorrect"); 
        }
    }
    private boolean CheckMaxMin(double number, double min, double max){
        if(number > min && number < max){
            return true;
        }
        return false;

    }
}
