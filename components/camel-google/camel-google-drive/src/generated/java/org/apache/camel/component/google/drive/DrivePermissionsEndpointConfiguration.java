/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Permissions}.
 */
@ApiParams(apiName = "drive-permissions", 
           description = "The permissions collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Deletes a permission from a file or shared drive", signatures={"com.google.api.services.drive.Drive$Permissions$Delete delete(String fileId, String permissionId)"}), @ApiMethod(methodName = "get", description="Gets a permission by ID", signatures={"com.google.api.services.drive.Drive$Permissions$Get get(String fileId, String permissionId)"}), @ApiMethod(methodName = "getIdForEmail", description="Returns the permission ID for an email address", signatures={"com.google.api.services.drive.Drive$Permissions$GetIdForEmail getIdForEmail(String email)"}), @ApiMethod(methodName = "insert", description="Inserts a permission for a file or shared drive", signatures={"com.google.api.services.drive.Drive$Permissions$Insert insert(String fileId, com.google.api.services.drive.model.Permission content)"}), @ApiMethod(methodName = "list", description="Lists a file's or shared drive's permissions", signatures={"com.google.api.services.drive.Drive$Permissions$List list(String fileId)"}), @ApiMethod(methodName = "patch", description="Updates a permission using patch semantics", signatures={"com.google.api.services.drive.Drive$Permissions$Patch patch(String fileId, String permissionId, com.google.api.services.drive.model.Permission content)"}), @ApiMethod(methodName = "update", description="Updates a permission", signatures={"com.google.api.services.drive.Drive$Permissions$Update update(String fileId, String permissionId, com.google.api.services.drive.model.Permission content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class DrivePermissionsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.drive.model.Permission"), @ApiMethod(methodName = "patch", description="The com.google.api.services.drive.model.Permission"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.Permission")})
    private com.google.api.services.drive.model.Permission content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "getIdForEmail", description="The email address for which to return a permission ID")})
    private String email;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID for the file or shared drive"), @ApiMethod(methodName = "get", description="The ID for the file or shared drive"), @ApiMethod(methodName = "insert", description="The ID for the file or shared drive"), @ApiMethod(methodName = "list", description="The ID for the file or shared drive"), @ApiMethod(methodName = "patch", description="The ID for the file or shared drive"), @ApiMethod(methodName = "update", description="The ID for the file or shared drive")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID for the permission"), @ApiMethod(methodName = "get", description="The ID for the permission"), @ApiMethod(methodName = "patch", description="The ID for the permission"), @ApiMethod(methodName = "update", description="The ID for the permission")})
    private String permissionId;

    public com.google.api.services.drive.model.Permission getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Permission content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
}
