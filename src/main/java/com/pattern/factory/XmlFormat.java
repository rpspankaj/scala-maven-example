package com.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class XmlFormat {
		List<OS> osLists = new ArrayList<>();

		/**
		 * @return the osLists
		 */
		public List<OS> getOsLists() {
			return osLists;
		}

		/**
		 * @param osLists the osLists to set
		 */
		public void setOsLists(List<OS> osLists) {
			this.osLists = osLists;
		}
		
}
