/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Jéssica Ferreira
 */
public class PessoaFisica extends Conta 
{
    private String cpf;
    
        
    
    public boolean validarCPF (String cpf )
    {
        if(cpf.length( )==11)
        {
            return true;
        }
        return false;
        
    } 

    public void setCpf (String cpf)
    {
        if(validarCPF (cpf))
        {
            this.cpf = cpf;
        }
        
    }

    public String getCpf() {
        return cpf;
    }

  
}
