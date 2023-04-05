package quanlyvattu;

public class khovattuxaydung{
    private String ten;
    private double ma;     
public khovattuxaydung(){   
} 
public khovattuxaydung(String ten, double ma){
    this.ten = ten;
    this.ma = ma;   
}
public String getTen(){
    return ten;
}
public void setTen(String ten){
    this.ten = ten;   
}
public double getMa(){
    return ma;
}
public void setMa(double ma){
    this.ma = ma;
}

@Override
public String toString(){
return"khovattuxaydung{" +"ten=" + ten + ",ma=" + ma +"}";
}
}

