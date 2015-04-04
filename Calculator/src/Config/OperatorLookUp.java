package Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Iterator;


import Opearations.Operation;

public final class OperatorLookUp
{
  private Map<String, String> operatorName;
  private Map<String, Operation> operatorMethod;
  
  private static OperatorLookUp lookup = new OperatorLookUp();
  
  private OperatorLookUp ()
  {
    BufferedReader br = null;
    String currentLine = null;
    try
    {
      br = new BufferedReader(new FileReader("/home/howard/algorithmJava/Calculator/src/Config/OperatorLookUp.config"));
    
      while ((currentLine = br.readLine()) != null)
      {
        String [] pair = currentLine.split(",");
        operatorName.put(pair[0], pair[1]);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        br.close();
	  }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
  
  private void assignOperators()
  {
    Iterator<Entry<String, String>> it =
      operatorName.entrySet().iterator();

    while (it.hasNext())
    {
      Map.Entry<String, String> pair =
        (Map.Entry<String, String>) it.next();
    }
  }
  
  public static OperatorLookUp getInstance()
  {
    return lookup;
  }
  
  public Map<String, String> getOperatorLookUp()
  {
    return operatorName;
  }
}
