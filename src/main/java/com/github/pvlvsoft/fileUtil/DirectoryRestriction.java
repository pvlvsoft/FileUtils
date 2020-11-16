package com.github.pvlvsoft.fileUtil;


import java.io.File;


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
 * <p>Class of {@link DirectoryRestriction} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 */
public class DirectoryRestriction implements CorrespondenceRestriction {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */




    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */





    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */




    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */

    /**
     * <p>This method defines if the file corresponds with the rules
     * defined by the class.</p>
     *
     * @param file to be checked against the rules of the class.
     *
     * @return the result of the correspondence check
     */
    @Override
    public boolean doesCorrespond(File file) {

        return file.isDirectory();
    }


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */




    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */

    /*
    public static void main(String[] args) {
        
        System.out.println(">>> QUICK TEST OF DirectoryRestriction BEGINS!");
        
        
        System.out.println(">>> QUICK TEST OF DirectoryRestriction ENDED SUCCESSFULLY!");
    }
    */

}
