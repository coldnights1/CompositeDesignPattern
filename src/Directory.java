import java.io.File;
import java.util.*;


public class Directory implements FileSystem{
  List<FileSystem> dirList;
  String dirName;
  Directory(String dirName){
      this.dirName=dirName;
      dirList=new ArrayList<FileSystem>();
  }

    public void ls(){
         System.out.println(dirName);
         for(int i=0;i<dirList.size();i++){
             dirList.get(i).ls();
         }
    }
}
