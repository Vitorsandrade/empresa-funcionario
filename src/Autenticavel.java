
//contrato Autenticavel
	//quem assina esse contrato precisa implementar
		//metode setSenha
		//metode autentica

public abstract interface Autenticavel{

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);	
	
	
	
}
