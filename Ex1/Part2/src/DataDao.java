import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataDao {
    public List<Data> getAllUsers(double latA, double latB, double lonA, double lonB, double result){

        List<Data> dataList = null;
        try {
            File file = new File("Datas.dat");
            if (!file.exists()) {
                Data data = new Data(latA,latB,lonA,lonB,result);
                dataList = new ArrayList<Data>();
                dataList.add(data);
                saveUserList(dataList);
            }
            else{
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                dataList = (List<Data>) ois.readObject();
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataList;
    }
    private void saveUserList(List<Data> userList){
        try {
            File file = new File("Datas.dat");
            FileOutputStream fos;
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
