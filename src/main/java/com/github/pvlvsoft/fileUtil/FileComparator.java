package com.github.pvlvsoft.fileUtil;


import java.io.File;
import java.io.FileReader;


/**
 * <i>AUTHOR OF THIS PROJECT IS NOT RESPONSIBLE FOR ANY DAMAGE TO
 * THE USER'S DEVICE CAUSED BY USING THIS SOFTWARE, NO DATA LEAKS
 * OR DATA INTEGRITY DAMAGE.</i>
 *
 * <i>THIS PIECE OF SOFTWARE WAS MADE WITH NO GUARANTEE AND SHOULD
 * NOT BE USED FOR CRITICAL INFRASTRUCTURE OF YOUR APPS. THIS
 * PROJECT WAS CREATED JUST FOR FUN.</i>
 *
 *
 * <p>Class of {@link FileComparator} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>This class was made as <b>Singleton</b>, there can be
 * only one instance at the time.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 * @see <a href="https://en.wikipedia.org/wiki/Singleton_pattern">Singleton at Wikipedia</a>
 */
public class FileComparator {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */




    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */

    /** Variable holding the only instance */
    private static volatile FileComparator INSTANCE = new FileComparator();

    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */


    private FileComparator() {}


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */





    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */


    public boolean areEqual(File file1, File file2) {

        return true;
    }

    public boolean doBothExist(File file1, File file2) {

        return file1.exists() && file2.exists();
    }

    public boolean hasSamePath(File file1, File file2) {

        return file1.getAbsolutePath().equals(file2.getAbsolutePath());
    }


    public boolean areBothSameType(File file1, File file2) {

        return areBothDirectories(file1, file2) || areBothFiles(file1, file2);
    }

    public boolean areBothDirectories(File file1, File file2) {

        return file1.isDirectory() && file2.isDirectory();
    }


    public boolean areBothFiles(File file1, File file2) {

        return file1.isFile() && file2.isFile();
    }


    public boolean hasSameContent(File file1, File file2) {

        if(doBothExist(file1, file2)) {

            if(areBothDirectories(file1, file2)) {

                file1.listFiles();
            }
        }

        return true;
    }


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */


    /**
     * <p>Returns the only instance of this class.</p>
     * <p>This {@code static} method belongs to the
     *
     * <b>Singleton</b> design pattern.</p>
     * <b>This method is THREAD-SAFE.</b>
     *
     * @see <a href="https://en.wikipedia.org/wiki/Singleton_pattern">Singleton at Wikipedia</a>
     */
    public static FileComparator getInstance() {

        return INSTANCE;
    }
}