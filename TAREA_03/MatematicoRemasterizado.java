
public class MatematicoRemasterizado
{
  public String CalcularEcuacion2Grado(int a, int b, int c)
  {
    calculadora resultado = new calculadora();
    
    return resultado.Ecuacion2Grado(a,b,c);
    
  }
  public String CalcularLado(double hipotenusa, double cateto)
  { 
    calculadora resultado = new calculadora();
    
    return resultado.LadoDeTriangulo(hipotenusa,cateto);
  }
}
