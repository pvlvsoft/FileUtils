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
 * <p>Enumeration of {@link GeneralPostfixRestrictions} is an abstract container of these
 * related types.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-11-16
 */
public enum GeneralPostfixRestrictions implements CorrespondenceRestriction {


    /** Graphics formats */
    PNG     (new PostfixFileNameRestriction("png")),
    JPG     (new PostfixFileNameRestriction("jpg"),
                new PostfixFileNameRestriction("jpeg")),
    GIF     (new PostfixFileNameRestriction("gif")),
    SVG     (new PostfixFileNameRestriction("svg")),
    BMP     (new PostfixFileNameRestriction("bmp")),


    /** Audio formats */
    MP3     (new PostfixFileNameRestriction("mp3")),
    WMV     (new PostfixFileNameRestriction("wmv")),
    M4A     (new PostfixFileNameRestriction("m4a")),
    FLAC    (new PostfixFileNameRestriction("flac")),
    WMA     (new PostfixFileNameRestriction("wma")),
    AAC     (new PostfixFileNameRestriction("aac")),
    WAV     (new PostfixFileNameRestriction("wav")),

    /** Video formats */
    MP4     (new PostfixFileNameRestriction("mp4")),
    MOV     (new PostfixFileNameRestriction("mov")),
    FLV     (new PostfixFileNameRestriction("flv")),
    AVI     (new PostfixFileNameRestriction("avi")),
    MKV     (new PostfixFileNameRestriction("mkv")),

    /** Documents formats */
    TXT     (new PostfixFileNameRestriction("txt")),
    DOC     (new PostfixFileNameRestriction("doc"),
            new PostfixFileNameRestriction("docx"),
            new PostfixFileNameRestriction("docm"),
            new PostfixFileNameRestriction("dot"),
            new PostfixFileNameRestriction("dotm"),
            new PostfixFileNameRestriction("dotx"),
            new PostfixFileNameRestriction("wps")),
    RTF     (new PostfixFileNameRestriction("rtf")),
    TeX     (new PostfixFileNameRestriction("tex")),
    PDF     (new PostfixFileNameRestriction("pdf")),
    HTML    (new PostfixFileNameRestriction("htm"),
                new PostfixFileNameRestriction("html")),
    XML     (new PostfixFileNameRestriction("xml"),
                new PostfixFileNameRestriction("xsd"),
                new PostfixFileNameRestriction("xslt")),
    ODT    (new PostfixFileNameRestriction("odt")),
    FB2    (new PostfixFileNameRestriction("fb2")),
    PAGES  (new PostfixFileNameRestriction("pages")),
    SRT     (new PostfixFileNameRestriction("srt")),
    JSON   (new PostfixFileNameRestriction("json")),
    XLS (new PostfixFileNameRestriction("xlsx"),
            new PostfixFileNameRestriction("xls"),
            new PostfixFileNameRestriction("xlsm"),
            new PostfixFileNameRestriction("xltx"),
            new PostfixFileNameRestriction("xlt"),
            new PostfixFileNameRestriction("xltx"),
            new PostfixFileNameRestriction("xlam"),
            new PostfixFileNameRestriction("xla"),
            new PostfixFileNameRestriction("xlw"),
            new PostfixFileNameRestriction("xlr")),
    XPS     (new PostfixFileNameRestriction("xps")),
    PPT     (new PostfixFileNameRestriction("ppt"),
            new PostfixFileNameRestriction("pptx"),
            new PostfixFileNameRestriction("pot"),
            new PostfixFileNameRestriction("potm"),
            new PostfixFileNameRestriction("potx"),
            new PostfixFileNameRestriction("ppa"),
            new PostfixFileNameRestriction("ppam"),
            new PostfixFileNameRestriction("pps"),
            new PostfixFileNameRestriction("ppsm"),
            new PostfixFileNameRestriction("ppsx"),
            new PostfixFileNameRestriction("pptm")),

    /** Code formats */
    JAVA   (new PostfixFileNameRestriction("java"),
            new PostfixFileNameRestriction("class")),
    JS     (new PostfixFileNameRestriction("js")),
    C      (new PostfixFileNameRestriction("cpp"),
             new PostfixFileNameRestriction("c"),
             new PostfixFileNameRestriction("cc")),
    PYTHON (new PostfixFileNameRestriction("py")),
    PHP     (new PostfixFileNameRestriction("php")),
    SQL     (new PostfixFileNameRestriction("sql")),
    CSHARP  (new PostfixFileNameRestriction("cs")),
    GO  (new PostfixFileNameRestriction("go")),
    R  (new PostfixFileNameRestriction("r")),
    PERL  (new PostfixFileNameRestriction("pl")),
    RUBY  (new PostfixFileNameRestriction("rb")),
    VB  (new PostfixFileNameRestriction("vb")),
    GROOVY  (new PostfixFileNameRestriction("groovy")),
    SCALA  (new PostfixFileNameRestriction("scala")),
    HASKELL  (new PostfixFileNameRestriction("hs")),
    LISP  (new PostfixFileNameRestriction("lisp")),
    SWIFT  (new PostfixFileNameRestriction("swift")),
    KOTLIN  (new PostfixFileNameRestriction("kt")),
    ASSEMBLY  (new PostfixFileNameRestriction("asm")),

    /** Compressed archives */
    ZIP (new PostfixFileNameRestriction("zip")),
    RAR (new PostfixFileNameRestriction("rar")),
    SEVEN_Z (new PostfixFileNameRestriction("7p")),


    /** Other useful formats */
    EXE (new PostfixFileNameRestriction("exe")),
    MD (new PostfixFileNameRestriction("md")),
    IML (new PostfixFileNameRestriction("iml")),
    MSI (new PostfixFileNameRestriction("msi")),
    ISO (new PostfixFileNameRestriction("iso")),
    DAT (new PostfixFileNameRestriction("dat")),
    JAR (new PostfixFileNameRestriction("jar")),
    WAR (new PostfixFileNameRestriction("war")),
    CSV (new PostfixFileNameRestriction("csv")),
    ODS (new PostfixFileNameRestriction("ods")),
    XLA (new PostfixFileNameRestriction("xla")),
    WMF (new PostfixFileNameRestriction("wmf")),
    XLC (new PostfixFileNameRestriction("xlc")),
    EMF (new PostfixFileNameRestriction("emf"))
    ;


    private PostfixFileNameRestriction[] restrictions;


    GeneralPostfixRestrictions(PostfixFileNameRestriction... restrictions) {

        this.restrictions = restrictions;
    }


    /**
     * <p>This method defines if the file corresponds with the rules
     * defined by the class.</p>
     *
     * @param file to be checked against the rules of the class.
     *
     * @return the result of the correspondence check
     * 
     */
    @Override
    public boolean doesCorrespond(File file) {

        for (PostfixFileNameRestriction restriction : this.restrictions) {

            if(restriction.doesCorrespond(file)) {

                return true;
            }
        }

        return false;
    }
}
