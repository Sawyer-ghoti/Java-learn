package Day13;

import java.io.File;

public class JavaFileSearch {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\13262\\IdeaProjects\\Java-learn");
        System.out.println(dir.getTotalSpace());
//        printDir(dir);
    }

    private static void printDir(File dir){
        File[] files = dir.listFiles();
        for (File file:
             files) {
            if (file.isFile()){
                //事文件，判断文件名并输出文件绝对路径
                if (file.getName().endsWith(".class")){
                    System.out.println("文件名："+file.getAbsolutePath());
                }
            }else{
                printDir(file);
            }
        }
    }
}
