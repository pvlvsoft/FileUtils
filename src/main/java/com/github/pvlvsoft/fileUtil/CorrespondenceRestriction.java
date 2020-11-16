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
 * <p>Interface of {@link CorrespondenceRestriction} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p>This interface defines the tools for correspondence restriction checks.
 * In other words every file can be checked against the given schema.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 */
public interface CorrespondenceRestriction {


    /**
     * <p>This method defines if the file corresponds with the rules
     * defined by the class.</p>
     *
     * @param file  to be checked against the rules of the class.
     *
     * @return      the result of the correspondence check
     */
    public boolean doesCorrespond(File file);
}
