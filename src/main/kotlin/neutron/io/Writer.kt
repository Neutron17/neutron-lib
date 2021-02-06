package neutron.io

import java.io.*
import java.lang.NullPointerException

class Writer {
    companion object {
        /** Write singe character to  file */
        fun writeWithAscii(ascii:Int,path:String) {
            try {
                val fos = FileOutputStream(path)
                fos.write(ascii)
                fos.flush()
                fos.close()
            } catch (ex: Exception) {
                println("" + ex)
            }
        }
        fun writeMultipleChar(text: String,path: String) {
            try {
                val fos = FileOutputStream(path)
                val a = text.toByteArray()
                fos.write(a)
                fos.flush()
                fos.close()
            } catch (ex: Exception) {
                println("" + ex)
            }
        }
        /** Write multiple chars with buffer */
        fun bufferedWriter(text: String, path: String) {
            try {
                val fos = FileOutputStream(path)
                val bout = BufferedOutputStream(fos)
                val a = text.toByteArray()
                bout.write(a)
                bout.flush()
                bout.close()
            } catch (ex: IOException) {
                System.err.println("Error in bufferedWriter")
                ex.printStackTrace()
            } catch (ex: NullPointerException) {
                System.err.println("Path cannot be null")
                ex.printStackTrace()
            }
        }
        /** Write to file without overwriting it's content */
        fun withoutOverwrite(text: String, path: String) {
            val log = File(path)
            try {
                if (!log.exists()) {
                    log.createNewFile()
                }
                val fileWriter = FileWriter(log, true)
                val bufferedWriter = BufferedWriter(fileWriter)
                bufferedWriter.write(text)
                bufferedWriter.close()
            } catch (e: IOException) {
                println("COULD NOT LOG!!")
            }
        }
    }
}