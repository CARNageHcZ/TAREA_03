public class calculadora
{
  private double resultado;
  public String Ecuacion2Grado(int a, int b, int c)
  {
    
    double resultado1 = ((b*(-1))+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    double resultado2 = ((b*(-1))-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    
    return "El resultado de x1 es: "+resultado1 + " // El resultado de x2 es: "+resultado2;
  }
  public String LadoDeTriangulo(double hipotenusa, double cateto)
  {
    resultado = Math.sqrt((hipotenusa*hipotenusa)-(cateto*cateto)); 
    
    return "El cateto faltante es: "+ resultado;
  }

}
