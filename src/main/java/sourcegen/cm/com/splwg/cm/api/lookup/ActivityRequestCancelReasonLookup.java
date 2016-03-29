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
 * ActivityRequestCancelReasonLookup is a class that represents the lookup field C1_AM_CANCEL_RSN_FLG
 * and its values:
   <table>
     <tr> <th>FIELD_VALUE</th> <th>Property Name</th> <th>Description</th> </tr>
     <tr> <td>ERR </td> <td>activityRequestError</td>
             <td>Activity request created in error</td> </tr>
    </table>
 * stored on the tables CI_LOOKUP_FIELD, CI_LOOKUP_VALUE.
 *
 * @author Generated by splDev.artifactGenerator
 */
public interface ActivityRequestCancelReasonLookup extends com.splwg.ccb.api.lookup.ActivityRequestCancelReasonLookup {

    //~ Static fields/initializers ---------------------------------------------------------------------------

    /* constants */
    public static final Constants constants = new Constants();
    
    public static class Constants {
        // New values
        /** Constant value representing lookup value for activityRequestError (value = 'ERR ')*/
        public ActivityRequestCancelReasonLookup ACTIVITY_REQUEST_ERROR; 
        // Old Values

        public void initialize() {
            // new values
            ACTIVITY_REQUEST_ERROR = 
                LookupHelper.getLookupInstance(ActivityRequestCancelReasonLookup.class, "ERR ");

           // original values
        }
    }

    //~ Methods ----------------------------------------------------------------------------------------------

    /* helper tester methods */
    /**
      * @return true if this Lookup represents activityRequestError
      */
    public boolean isActivityRequestError();


}