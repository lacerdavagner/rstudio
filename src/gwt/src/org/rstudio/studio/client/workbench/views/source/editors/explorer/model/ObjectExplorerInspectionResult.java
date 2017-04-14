/*
 * ObjectExplorerInspectionResult.java
 *
 * Copyright (C) 2009-17 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.source.editors.explorer.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

// NOTE: synchronize the structure of this object with the
// R object returned by 'explorer.createInspectionResult'
// defined in 'SessionObjectExplorer.R'
public class ObjectExplorerInspectionResult extends JavaScriptObject
{
   protected ObjectExplorerInspectionResult()
   {
   }
   
   public final native String        getObjectId()          /*-{ return this["id"];         }-*/;
   public final native String        getObjectAddress()     /*-{ return this["address"];    }-*/;
   public final native String        getObjectType()        /*-{ return this["type"];       }-*/;
   public final native JsArrayString getObjectClass()       /*-{ return this["class"];      }-*/;
   public final native int           getObjectLength()      /*-{ return this["length"];     }-*/;
   public final native String        getObjectAccess()      /*-{ return this["access"];     }-*/;
   public final native boolean       isRecursive()          /*-{ return this["recursive"];  }-*/;
   public final native boolean       isExpandable()         /*-{ return this["expandable"]; }-*/;
   public final native boolean       isS4()                 /*-{ return this["s4"];         }-*/;
   
   public final native JsArrayString getTags()              /*-{ return this["tags"];       }-*/;
   
   public final native String        getDisplayName()       /*-{ return this["display"]["name"]; }-*/;
   public final native String        getDisplayType()       /*-{ return this["display"]["type"]; }-*/;
   public final native String        getDisplayDesc()       /*-{ return this["display"]["desc"]; }-*/;
   
   public final native boolean hasTag(String tag)
   /*-{
      var tags = this["tags"] || [];
      for (var i = 0, n = tags.length; i < n; i++)
         if (tags[i] == tag)
            return true;
      return false;
   }-*/;
   
   public final native JsArray<ObjectExplorerInspectionResult> getChildren()
   /*-{
      return this["children"];
   }-*/;
   
   public final native void setChildren(JsArray<ObjectExplorerInspectionResult> children)
   /*-{
      this["children"] = children;
   }-*/;
}