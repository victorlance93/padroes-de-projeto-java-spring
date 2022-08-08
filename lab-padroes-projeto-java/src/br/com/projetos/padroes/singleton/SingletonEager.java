package br.com.projetos.padroes.singleton;

/**
 * Singleton "Lazy Holder"
 * @author Victor
 *
 */

public class SingletonEager {

	private static class InstanceHolder{
		public static SingletonEager instacia = new SingletonEager();
	}
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstacia() {
		return  InstanceHolder.instacia;
	}
	
}
