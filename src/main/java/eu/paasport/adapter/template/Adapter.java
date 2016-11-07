package eu.paasport.adapter.template;

import eu.paasport.model.*;
import eu.paasport.services.api.adapter.response.*;

//import java.util.logging.Logger;


/**
 * Template for the Adapter class that is used for the integration of a PaaS offering
 * on PaaSport Marketplace
 */
public class Adapter implements eu.paasport.services.api.adapter.IAdapter {
    //private static final Logger logger = Logger.getLogger(Adapter.class.getName());

    public CreateApplicationAdapterResponse createApplication(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, ApplicationRequest applicationrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DeployApplicationAdapterResponse deployApplication(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp, PackageLocatorModel packagelocator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public StartApplicationAdapterResponse startApplication(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public StopApplicationAdapterResponse stopApplication(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DeleteApplicationAdapterResponse deleteApplication(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RegisterSSHKeyToProviderAdapterResponse registerSSHKeyToProvider(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, SSHKeyModel sshkey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RemoveSSHKeyFromProviderAdapterResponse removeSSHKeyFromProvider(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, SSHKeyModel sshkey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GetAvailableServicesListResponse getAvailableServicesList(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CreateServiceBindingResponse createServiceBinding(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp, AvailableServiceModel availableService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RetrieveServiceBindingResponse retrieveServiceBinding(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UpdateServiceBindingResponse updateServiceBinding(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp, AvailableServiceModel availableService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DeleteServiceBindingResponse deleteServiceBinding(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp, AvailableServiceModel availableService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GetBoundServicesListResponse getBoundServicesList(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, GroundedApplicationModel groundedapp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GetNameAvailabilityResponse getNameAvailability(CredentialsModel credentials, GroundedPaaSOfferingModel groundedpaasoffering, ApplicationRequest applicationrequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
   

