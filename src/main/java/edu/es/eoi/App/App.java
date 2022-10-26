package edu.es.eoi.App;

import edu.es.eoi.Service.BancoDao;
import edu.es.eoi.Service.BancoDaoJPAImpl;
import edu.es.eoi.Service.ClienteDao;
import edu.es.eoi.Service.ClienteDaoJPAImpl;
import edu.es.eoi.Service.CuentaDao;
import edu.es.eoi.Service.CuentaDaoJPAImpl;
import edu.es.eoi.entity.Banco;
import edu.es.eoi.entity.Cliente;
import edu.es.eoi.entity.Cuenta;

public class App {

	public static void main(String[] args) {
		//CREAR 5 CLIENTES
		ClienteDao clienteDao = new ClienteDaoJPAImpl();
//		Cliente nuevoCliente = new Cliente();
//		nuevoCliente.setNombre("Silvia");
//		nuevoCliente.setDireccion("Direccion 5");
//		nuevoCliente.setDni("2263321H");
//		clienteDao.create(nuevoCliente);
		
		//CREAR 5 BANCOS
		BancoDao bancoDao = new BancoDaoJPAImpl();
//		Banco nuevoBanco = new Banco();
//		nuevoBanco.setNombre("Caixabank");
//		nuevoBanco.setCiudad("Vigo");
//		bancoDao.create(nuevoBanco);
		
		//RECUPERAR CLIENTE POR CLAVE PRINCIPAL, DNI
//		Cliente cliente=clienteDao.read("1223512F");
//		System.out.println(cliente);
		
		//RECUPERAR BANCO POR CLAVE PRINCIPAL, ID
//		Banco banco=bancoDao.read(1);
//		System.out.println(banco);
		
		// ASOCIAR CUENTA A CLIENTE
		CuentaDao cuentaDao = new CuentaDaoJPAImpl();
		
//		Cliente cliente = clienteDao.read("1223512F");   //Recuperamos cliente ya construido.
//		Banco banco = bancoDao.read(1);                  //Recuperamos un banco.
//		Cuenta cuentaCliente = new Cuenta();            //Creamos nueva cuenta.
//		cuentaCliente.setSaldo(1200);                  //Definimos saldo.
//		cuentaCliente.setBanco(banco);                //Asociamos ese banco con la cuenta.
//		cuentaCliente.setCliente(cliente);           // Asociamos esa cuenta con el cliente.
//		cuentaDao.create(cuentaCliente);
		
		
		
		
		

	}

}
