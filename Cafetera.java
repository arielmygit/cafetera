package org.example;

import java.util.Arrays;

public class Cafetera {
    public static int num_vasos = 50;
    public static int ml_agua = 5000;
    public static int ml_cafe = 1000;
    public static int ml_crema = 1500;
    private int[] cap_agua;
    private int[] cap_cafe;
    private int[] cap_crema;
    private Vaso[] vasos;

    public Cafetera() {
        this.vasos = new Vaso[num_vasos];
        this.cap_agua = new int[ml_agua];
        this.cap_cafe = new int[ml_cafe];
        this.cap_crema = new int[ml_crema];
    }

    public Cafetera(int[] cap_agua, int[] cap_cafe, int[] cap_crema, Vaso[] vasos) {
        this.cap_agua = cap_agua;
        this.cap_cafe = cap_cafe;
        this.cap_crema = cap_crema;
        this.vasos = vasos;
    }

    public int[] getCap_agua() {
        return cap_agua;
    }

    public void setCap_agua(int[] cap_agua) {
        this.cap_agua = cap_agua;
    }

    public int[] getCap_cafe() {
        return cap_cafe;
    }

    public void setCap_cafe(int[] cap_cafe) {
        this.cap_cafe = cap_cafe;
    }

    public int[] getCap_crema() {
        return cap_crema;
    }

    public void setCap_crema(int[] cap_crema) {
        this.cap_crema = cap_crema;
    }

    public Vaso[] getVasos() {
        return vasos;
    }

    public void setVasos(Vaso[] vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "cap_agua=" + Arrays.toString(cap_agua) +
                ", cap_cafe=" + Arrays.toString(cap_cafe) +
                ", cap_crema=" + Arrays.toString(cap_crema) +
                ", vasos=" + Arrays.toString(vasos) +
                '}';
    }

    public void refill(){
        System.out.println("Rellenando cafetera...");
        ml_agua= 5000;
        ml_cafe=1000;
        ml_crema=1500;
        num_vasos=50;
        revisar();
    }

    public void revisar(){
        System.out.println("Quedan "+ml_cafe+" gr de cafe, "+ml_agua+" ml de agua, "+ml_crema+" ml de crema y "+num_vasos+" vasos");

    }

    public void americano(){

        if (ml_agua>=180 && ml_crema>0 && ml_cafe>=15 && num_vasos>0){

        System.out.println("Haciendo americano...");
        ml_cafe = ml_cafe-15;
        ml_agua = ml_agua-180;
        num_vasos=num_vasos-1;
        revisar();
        }

        else{
            System.out.println("No se pueden hacer mas americanos:(, prueba otro o rellena con el metodo refill()");
            revisar();
        }

    }

    public void expreso(){

        if (ml_agua>=120 && ml_crema>0 && ml_cafe>=20 && num_vasos>0){

        System.out.println("Haciendo expreso...");
        ml_agua=ml_agua-120;
        ml_cafe=ml_cafe-20;
        num_vasos=num_vasos-1;
        revisar();
        }
        else{
            System.out.println("No se pueden hacer mas expresos:(, prueba otro o rellena con el metodo refill()");
            revisar();
        }

    }
    public void capuchino(){

        if (ml_agua>=100 && ml_crema>=70 && ml_cafe>=14 && num_vasos>0){
        System.out.println("Haciendo capuchino...");

        ml_agua=ml_agua-100;
        ml_crema=ml_crema-70;
        ml_cafe=ml_cafe-14;
        num_vasos=num_vasos-1;
        revisar();
        }
        else{
            System.out.println("No se pueden hacer mas capuchinos:(, prueba otro o rellena con el metodo refill()");
            revisar();
        }

    }



}
