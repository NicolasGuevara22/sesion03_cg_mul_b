package sistemascoordenadas2d;


public class Cilindrica {
    private double radio1;
    private double angulo1;
    private double z;
    
    /* Crear 
    2 formas del constructor: 1 sin parametros
                              otro con parametros
    metodos sobrecargados para convertir de
    cilindrica a esferica 
    esferica a cilindrica
    
    */

    public Cilindrica(double radio1, double angulo1, double z) {
        this.radio1 = radio1;
        this.angulo1 = angulo1;
        this.z = z;
    }
    
    public Cilindrica() {
    }
    
    public Cilindrica(double radio1, double angulo1, double z) {
        this.radio1 = radio1;
        this.angulo1 = angulo1;
        this.z = z;
    }
   

    public double getRadio() {
        return radio1;
    }

    public void setRadio(double radio) {
        this.radio1 = radio;
    }

    public double getAngulo() {
        return angulo1;
    }

    public void setAngulo(double angulo) {
        this.angulo1 = angulo;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Cilindrica cilindrica_esferica(double radio1 ,double angulo1  ,double z) {
        Cilindrica objc = new Cilindrica();
       
        return objc;
        
    }
}
