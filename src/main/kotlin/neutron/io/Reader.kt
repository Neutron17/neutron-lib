package neutron.io

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.util.*

class Reader {
    companion object {
        /** Read a single char from a file */
    fun readSingleChar(path:String) {
        try {
            val fis = FileInputStream(path) // File path
            val i = fis.read()
            println(i.toChar())
            fis.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    /** Read multiple chars from a file */
    fun readMultipleChar(path: String) {
        try {
            val fis = FileInputStream(path) // File path
            var i = 0
            var result = ""
            while (fis.read().also { i = it } != -1) {
                result += i.toChar()
            }
            println(result)
            fis.close()
            println("Finished")
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    /** Read multiple chars with buffer */
    fun bufferedReader(path: String) {
        try {
            val fis = FileInputStream(path); // File path
            val bin = BufferedInputStream(fis);
            var i = 0;
            var result = "";
            while (bin.read().also { i = it } != -1) {
                result += i.toChar();
            }
            println(result);
            fis.close();
        } catch (ex:Exception) {
            System.out.println("" + ex);
        }
    }
    fun read(path:String):String {
        try {
            val file = File(path);
            val sc = Scanner(file);
            while (sc.hasNextLine()) {
                var data = sc.nextLine();
                println(data);
                return data;
            }
            sc.close();
        } catch (e: FileNotFoundException) {
            e.printStackTrace();
        }
        return "";
    }
    }
}