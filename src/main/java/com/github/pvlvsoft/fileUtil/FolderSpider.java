package com.github.pvlvsoft.fileUtil;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


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
 * <p>Class of {@link FolderSpider} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>This class is responsible for folder search. Instances of this
 * class can go through the filesystem from given folder and get
 * all the files inside (using recursion).</p>
 *
 * <p>The result is a {@link List} of {@link File}s corresponding
 * by the given restriction.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 */
public class FolderSpider {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private File rootFolder;
    private List<File> files = new ArrayList<>();
    private boolean includeFolders;

    private CorrespondenceRestriction[] restrictions;

    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */



    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    private FolderSpider() {}


    public FolderSpider(File rootFolder, boolean includeFolders, CorrespondenceRestriction... crs) {

        this.rootFolder = rootFolder;
        this.restrictions = crs;

        this.includeFolders = includeFolders;
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */




    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */

    public List<File> search() throws IllegalArgumentException {

        this.files.clear();

        search(rootFolder);

        return this.files;
    }


    private void search(File folder) {

        if(folder.isFile()) {

            for (CorrespondenceRestriction cr : this.restrictions) {

                if(cr.doesCorrespond(folder)) {

                    this.files.add(folder);
                    break;
                }
            }

        } else {

            if(includeFolders) {

                this.files.add(folder);
            }

            for (File file : folder.listFiles()) {

                this.search(file);
            }
        }
    }


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */



    private static boolean folderCheck(File file) throws IllegalArgumentException {

        if(!file.exists()) {

            throw new IllegalArgumentException("Folder does not exist!");

        } else if(!file.isDirectory()) {

            throw new IllegalArgumentException("File is not directory!");

        } else if(!file.canRead()) {

            throw new IllegalArgumentException("Cannot read the file!");
        }

        return true;
    }



    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */



    public static void main(String[] args) {

        FolderSpider fs = new FolderSpider(new File("D:/Hudba"), false, GeneralPostfixRestrictions.WMA, GeneralPostfixRestrictions.AAC);
        List<File> files = fs.search();

        for (File f : files) {

            System.out.println(f.getName());
        }
    }
}
