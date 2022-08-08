package br.com.projetos.padroes.singleton;

public class Test {

	public static void main(String[] args) {
		
		//Teste relacionados ao Desing Patter Singleton
		
		SingletonLazy lazy =  SingletonLazy.getInstacia();
		System.out.println(lazy);
		 lazy =  SingletonLazy.getInstacia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		eager = SingletonEager.getInstacia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
	}

}
