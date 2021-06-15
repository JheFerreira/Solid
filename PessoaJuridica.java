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
public class PessoaJuridica extends Conta
{
  
    private String cnpj;
   
    
 public boolean validarCNPJ (String cnpj )
    {
    if(cnpj.length( )==14)
    {
        return true;
    }
    return false;
    
    }
 public void setcnpj (String cnpj)
    {
        if(validarCNPJ (cnpj)){
            this.cnpj = cnpj;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
 
    
}
