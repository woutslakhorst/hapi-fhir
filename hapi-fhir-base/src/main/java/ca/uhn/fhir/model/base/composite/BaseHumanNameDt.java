package ca.uhn.fhir.model.base.composite;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import ca.uhn.fhir.model.api.BaseIdentifiableElement;
import ca.uhn.fhir.model.primitive.StringDt;

public abstract class BaseHumanNameDt extends BaseIdentifiableElement {

	/**
	 * Gets the value(s) for <b>family</b> (Family name (often called 'Surname')). creating it if it does not exist. Will not return <code>null</code>.
	 *
	 * <p>
	 * <b>Definition:</b> The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.
	 * </p>
	 */
	public abstract java.util.List<StringDt> getFamily();

	/**
	 * Returns all repetitions of {@link $ hash}getFamily() family name} as a space separated string
	 * 
	 * @see DatatypeUtil${hash}joinStringsSpaceSeparated(List)
	 */
	public String getFamilyAsSingleString() {
		return ca.uhn.fhir.util.DatatypeUtil.joinStringsSpaceSeparated(getFamily());
	}

	/**
	 * Gets the value(s) for <b>given</b> (Given names (not always 'first'). Includes middle names). creating it if it does not exist. Will not return <code>null</code>.
	 *
	 * <p>
	 * <b>Definition:</b> Given name
	 * </p>
	 */
	public abstract java.util.List<StringDt> getGiven();

	/**
	 * Returns all repetitions of {@link $ hash}getGiven() given name} as a space separated string
	 * 
	 * @see DatatypeUtil${hash}joinStringsSpaceSeparated(List)
	 */
	public String getGivenAsSingleString() {
		return ca.uhn.fhir.util.DatatypeUtil.joinStringsSpaceSeparated(getGiven());
	}

	/**
	 * Gets the value(s) for <b>prefix</b> (Parts that come before the name). creating it if it does not exist. Will not return <code>null</code>.
	 *
	 * <p>
	 * <b>Definition:</b> Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the start of the name
	 * </p>
	 */
	public abstract java.util.List<StringDt> getPrefix();

	/**
	 * Returns all repetitions of {@link $ hash}getPrefix() prefix name} as a space separated string
	 * 
	 * @see DatatypeUtil${hash}joinStringsSpaceSeparated(List)
	 */
	public String getPrefixAsSingleString() {
		return ca.uhn.fhir.util.DatatypeUtil.joinStringsSpaceSeparated(getPrefix());
	}

	/**
	 * Gets the value(s) for <b>suffix</b> (Parts that come after the name). creating it if it does not exist. Will not return <code>null</code>.
	 *
	 * <p>
	 * <b>Definition:</b> Part of the name that is acquired as a title due to academic, legal, employment or nobility status, etc. and that appears at the end of the name
	 * </p>
	 */
	public abstract java.util.List<StringDt> getSuffix();

	/**
	 * Returns all repetitions of {@link $ hash}Suffix() suffix} as a space separated string
	 * 
	 * @see DatatypeUtil${hash}joinStringsSpaceSeparated(List)
	 */
	public String getSuffixAsSingleString() {
		return ca.uhn.fhir.util.DatatypeUtil.joinStringsSpaceSeparated(getSuffix());
	}

	@Override
	public String toString() {
		ToStringBuilder b = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		b.append("family", getFamilyAsSingleString());
		b.append("given", getGivenAsSingleString());
		return b.toString();
	}
	
}
