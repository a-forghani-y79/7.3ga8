package com.ali.headless.counter.resource.v1_0;

import com.liferay.portal.vulcan.accept.language.AcceptLanguage;

import java.util.Locale;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-counter/v1.0
 *
 * @author jinos
 * @generated
 */
@Generated("")
@ProviderType
public interface CounterResource {

	public static Builder builder() {
		return FactoryHolder.factory.create();
	}

	public String getCounterGetnames() throws Exception;

	public Long getCounterIncrement() throws Exception;

	public Long getCounterIncrementName(String name) throws Exception;

	public Long getCounterIncrementNameSize(String name, Integer size)
		throws Exception;

	public void getCounterRenameOldNameNewName(String oldName, String newName)
		throws Exception;

	public void getCounterResetName(String name) throws Exception;

	public void getCounterResetNameSize(String name, Long size)
		throws Exception;

	public String getTestId(Long id) throws Exception;

	public default void setContextAcceptLanguage(
		AcceptLanguage contextAcceptLanguage) {
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany);

	public default void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {
	}

	public default void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {
	}

	public default void setContextUriInfo(UriInfo contextUriInfo) {
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser);

	public static class FactoryHolder {

		public static volatile Factory factory;

	}

	@ProviderType
	public interface Builder {

		public CounterResource build();

		public Builder checkPermissions(boolean checkPermissions);

		public Builder httpServletRequest(
			HttpServletRequest httpServletRequest);

		public Builder preferredLocale(Locale preferredLocale);

		public Builder user(com.liferay.portal.kernel.model.User user);

	}

	@ProviderType
	public interface Factory {

		public Builder create();

	}

}