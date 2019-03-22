package main.java.jdk;

public interface jdk181 {
    double calaulate(int a);
    default double sqat(int a){
        return Math.sqrt(a);
    }
}
