package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	//O metodo abstrato forca que as constantes/enums implemente o metodo!!
	public abstract Cargo getProximoCargo();

}
