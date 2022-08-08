package br.com.projetos.padroes.singleton;

/**
 * Singleton "Preguiçoso"
 * @author Victor
 *
 */

public class SingletonLazyHolder {

	private static SingletonLazyHolder instacia;
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		if(instacia == null) {
			instacia = new SingletonLazyHolder();
		}
		return instacia;
	}
	
}
