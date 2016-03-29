/**
 * Generated by com.splwg.tools.artifactgen.ArtifactGenerator
 * Template: LookupInterface.vm
 * $File: //FW/4.0.1/Code/modules/tools/source/java/com/splwg/tools/artifactgen/templates/LookupInterface.vm $
 * $DateTime: 2009/12/17 11:38:59 $
 * $Revision: #1 $
 */
package com.splwg.cm.api.lookup;

import com.splwg.base.api.datatypes.LookupHelper;

/**
 * BadLineReasonLookup is a class that represents the lookup field C1_BAD_LINE_RSN_FLG
 * and its values:
   <table>
     <tr> <th>FIELD_VALUE</th> <th>Property Name</th> <th>Description</th> </tr>
     <tr> <td>BAD </td> <td>illegible</td>
             <td>Illegible</td> </tr>
    </table>
 * stored on the tables CI_LOOKUP_FIELD, CI_LOOKUP_VALUE.
 *
 * @author Generated by splDev.artifactGenerator
 */
public interface BadLineReasonLookup extends com.splwg.ccb.api.lookup.BadLineReasonLookup {

    //~ Static fields/initializers ---------------------------------------------------------------------------

    /* constants */
    public static final Constants constants = new Constants();
    
    public static class Constants {
        // New values
        /** Constant value representing lookup value for illegible (value = 'BAD ')*/
        public BadLineReasonLookup ILLEGIBLE; 
        // Old Values

        public void initialize() {
            // new values
            ILLEGIBLE = 
                LookupHelper.getLookupInstance(BadLineReasonLookup.class, "BAD ");

           // original values
        }
    }

    //~ Methods ----------------------------------------------------------------------------------------------

    /* helper tester methods */
    /**
      * @return true if this Lookup represents illegible
      */
    public boolean isIllegible();


}