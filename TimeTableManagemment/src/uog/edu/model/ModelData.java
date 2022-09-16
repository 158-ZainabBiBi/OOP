package uog.edu.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class ModelData 
{
	@SuppressWarnings("resource")
	public static List<Model> FindAll()
	{
		List<Model> models = new ArrayList<Model>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Model.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Model model=new Model();
				String[] modelrow = line.split(",");
				model.setMODEL_ID(Integer.parseInt(modelrow[0]));
				model.setWEEKDAY_NAME(modelrow[1]);
				model.setTIMESLOT_No(Integer.parseInt(modelrow[2]));
				model.setTIMESLOT_TIME(modelrow[3]);
				model.setCOURSE_NAME(modelrow[4]);
				model.setTEACHER_NAME(modelrow[5]);
				model.setROOM_NAME(modelrow[6]);
				model.setBATCH_DETAILS(modelrow[7]);
				models.add(model);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return models;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static Model Search(int model_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Model.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Model model=new Model();
				String[] modelrow = line.split(",");
				if(Integer.parseInt(modelrow[0])== model_id)
				{
					model.setMODEL_ID(Integer.parseInt(modelrow[0]));
					model.setWEEKDAY_NAME(modelrow[1]);
					model.setTIMESLOT_No(Integer.parseInt(modelrow[2]));
					model.setTIMESLOT_TIME(modelrow[3]);
					model.setCOURSE_NAME(modelrow[4]);
					model.setTEACHER_NAME(modelrow[5]);
					model.setROOM_NAME(modelrow[6]);
					model.setBATCH_DETAILS(modelrow[7]);
				    return model;
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return null;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "static-access" })
	public static  Model Save(Model model)
	{
		FileWriter filewriter;
        List<Model> models = FindAll();
		try 
		{
			filewriter = new FileWriter(Model.csvFile);
			for(int i=0; i<models.size(); i++)
			{
				filewriter.append(models.get(i).toString());
				filewriter.append("\n");
			}
			if(models.size()>0)
			   {  model.setMODEL_ID(models.get(models.size()-1).getMODEL_ID()+1);  }
			else
			   {  model.setMODEL_ID(1);  }
			filewriter.append(model.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return model;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Model> models = FindAll();
		try 
		{
			filewriter = new FileWriter(Model.csvFile);
			
			for(int i=0;i<models.size();i++) 
			{
				models.remove(i);
			}
				filewriter.flush();
				filewriter.close();
	    } 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return "Removed Successfully";
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
  public static Model DelOne(int model_id) 
  {
		FileWriter filewriter;
		List<Model> models = FindAll();
		Model model = ModelData.Search(model_id);
		try 
		{
			filewriter = new FileWriter(Model.csvFile);
			for(int i=0;i<models.size();i++) 
			{
				if(models.get(i).getMODEL_ID()!=model_id)
				{
					filewriter.append(models.get(i).toString());
					filewriter.append("\n");
				}
			}
			    filewriter.flush();
				filewriter.close();
	    } 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return model;
	}
}