package clawMachine.entity;


import clawMachine.exceptions.WrongNominalException;

import java.util.ArrayList;
import java.util.List;

public class CoinAcceptor {
    private List<String> list = new ArrayList();

    {
        list.add("50���");
        list.add("1���");
        list.add("2���");
    }

    public String acceptCoin(String nominal) throws WrongNominalException {
      if(list.contains(nominal)){
          return nominal;
      }
      else{
          throw new WrongNominalException();
      }
    }


}
