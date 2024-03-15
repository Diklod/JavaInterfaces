package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Dados
{
    ArrayList <Cadastro> lista = new ArrayList<Cadastro>();
            
    public boolean adicionar (Cadastro cadastro)
    {
        if ( buscar (cadastro) )
        {
            return false;
        }
        else
        {
            lista.add(cadastro);
            return true;
        }
    }
    
    public ArrayList<Cadastro> consultar ()
    {
        return lista;
    }
    
    public void ordenar ()
    {
        Collections.sort(lista);
    }
    
    public boolean buscar (Cadastro cadastroProcurado)
    {               
        boolean encontrado = false;
        
        for (Cadastro cadastro : lista)
        {
            if (cadastro.getName().equals(cadastroProcurado.getName()));
            {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public boolean remover (Cadastro cadastroRemover)
    {
        boolean removido = false;
        
        for (Cadastro cadastro : lista)
        {
            if (cadastro.getName().equals(cadastroRemover.getName()));
            {
                lista.remove(cadastro);
                removido = true;
            }
        }
        
        return removido;
    }
}
