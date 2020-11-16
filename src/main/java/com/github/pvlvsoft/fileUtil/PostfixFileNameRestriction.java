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
 * <p>Class of {@link PostfixFileNameRestriction} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 */
public class PostfixFileNameRestriction extends RegexFileNameRestriction {

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

    public PostfixFileNameRestriction(String postfix) {

        super(String.format("^.*\\.%s$", postfix.toLowerCase()));
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */




    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */




    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */




    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */


    public static void main(String[] args) {

        PostfixFileNameRestriction pfnr = new PostfixFileNameRestriction("mac");
        System.out.println(pfnr.doesCorrespond(new File("D:/mac.txt")));
    }

}
