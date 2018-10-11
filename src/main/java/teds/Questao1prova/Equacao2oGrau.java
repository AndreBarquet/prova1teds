package teds.Questao1prova;

public class Equacao2oGrau {
	private double a;
	private double b;
	private double c;

	public Equacao2oGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double delta() {
		return b * b - 4.0 * a * c;
	}
	
	private Raizes getRaizUnica() {
		return new Raizes((-b) / (2.0 * a), (-b) / (2.0 * a));
	}
	
    private Raizes getDuasRaizes(double d) {
		return new Raizes(((-b) + Math.sqrt(d)) / (2.0 * a), ((-b) - Math.sqrt(d)) / (2.0 * a));
	}
	
    public Raizes getRaizes() {
		double d = delta();
		if (d < 0.0) {
			throw new ArithmeticException("Delta Negativo. Não existem raízes reais.");
		} else if (d == 0.0) {
			return getRaizUnica();
		} else {
			return getDuasRaizes(d);
		}
	}
}
